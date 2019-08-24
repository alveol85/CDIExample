package example.pattern.proxy;

import example.java8.dto.CasaBasicoDTO;

public class ExampleProxyRefletion implements IExampleProxyRefletion {
	
	private CasaBasicoDTO casaBasico;

	public ExampleProxyRefletion(CasaBasicoDTO casaBasico) {
		this.casaBasico = casaBasico;
	}
	
	public String methodProxied(){
		
		System.out.println("dto con valores del proxy");
		System.out.println(casaBasico.getBarrio());
		System.out.println(casaBasico.getDireccion());
		
		return "finalizo";
		
	}

}
