package example.java8.business;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import example.java8.dto.CasaBasicoDTO;
import example.java8.dto.CasaDTO;

public class LambdaExample {
	
	public void execLambdaExamples(){
		
		BiFunction<String, String, String> bi = (x, y) -> {
			return x + y;
		};
		Function<String, String> f = x -> x + " new";

		System.out.println(bi.andThen(f).andThen(f).apply("java2s.com", "tutorial"));

		List<String> ciudades = Arrays.asList("Cali", "Bogotá", "Medellín", "Cali");
		// Stream sin ciudades repetidas: Cali, Bogotá, Medellín
		Stream stream = ciudades.stream().distinct();

		List<String> ciudades2 = Arrays.asList("Cali", "Bogotá", "Medellín");
		// Stream limitado a los dos primeros elementos: Cali, Bogotá
		Stream stream2 = ciudades2.stream().limit(2);

		List<String> ciudades3 = Arrays.asList("Cali", "Bogotá", "Medellín");
		// Stream que ha saltado los dos primeros elementos, quedando solo:
		// Medellín
		Stream stream3 = ciudades3.stream().skip(2);

		List<CasaDTO> sector1 = Arrays.asList(new CasaDTO("cra 49", "manchester", "integral", "segundo", 2, 1),
				new CasaDTO("cra 68", "manchester", "semi integral", "primero", 4, 2),
				new CasaDTO("cra 60", "granjas", "integral", "segundo", 2, 1),
				new CasaDTO("cra 61", "granjas", "semi integral", "primero", 4, 2),
				new CasaDTO("cra 32", "perez", "semi integral", "primero", 4, 2));

		Map<String, List<CasaDTO>> casasAgrupadasPorBarrio = sector1.stream()
				.collect(Collectors.groupingBy(CasaDTO::getBarrio));

		Map<String, Integer> agruparBarrioPorNumeroDePiezas = agruparBarrioPorNumeroDePiezas(sector1);

		int e = agruparNumeroDePiezas(sector1);

		List<CasaBasicoDTO> agruparPorPiezaYBathroom = agruparPorPiezaYBathroom(sector1);

		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		desagruparListaDeArrayCreandoUnoSolo(data).forEach(System.out::println);
		ejemploReduceAcumulador();
		
	}
	
	public static void ejemploReduceAcumulador() {
		int[] numeros = { 23, 43, 56, 97, 32 };
		// Set start value. Result will be start value + sum of array.
		int startValue = 100;
		int sum = Arrays.stream(numeros).reduce(startValue, (x, y) -> x + y);
		System.out.println(sum);
		sum = Arrays.stream(numeros).reduce(startValue, Integer::sum);
		System.out.println(sum);
	}

	private static List<String> desagruparListaDeArrayCreandoUnoSolo(String[][] data) {
		Stream<String[]> temp = Arrays.stream(data);

		List<String> stringStream = temp.flatMap(x -> {
			System.out.println(x);
			return Arrays.stream(x);
		}).collect(Collectors.toList());
		return stringStream;
	}

	private static Map<String, Integer> agruparBarrioPorNumeroDePiezas(List<CasaDTO> sector1) {
		return sector1.stream()
				.collect(Collectors.groupingBy(CasaDTO::getBarrio, Collectors.summingInt(CasaDTO::getPiezas)));
	}

	private static Integer agruparNumeroDePiezas(List<CasaDTO> sector1) {
		return sector1.stream().collect(Collectors.summingInt(CasaDTO::getPiezas));
	}

	public static List<CasaBasicoDTO> agruparPorPiezaYBathroom(List<CasaDTO> sector) {

		return sector.stream().collect(Collectors.groupingBy(CasaDTO::getBarrio)).entrySet().stream().map(listCasas -> {
			CasaBasicoDTO casa = new CasaBasicoDTO();
			casa.setBarrio(listCasas.getKey());

			Integer piezas = listCasas.getValue().stream().collect(Collectors.summingInt(CasaDTO::getPiezas));
			casa.setPiezas(piezas);

			Integer bathrooms = listCasas.getValue().stream().collect(Collectors.summingInt(CasaDTO::getBathrooms));
			casa.setBathrooms(bathrooms);

			return casa;
		}).collect(Collectors.toList());

	}

}
