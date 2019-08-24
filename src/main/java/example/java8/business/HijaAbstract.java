package example.java8.business;

public class HijaAbstract extends ClaseAbstracta {
	
	private String atributo1Hija;
	private String atributo2Hija;
	
	public HijaAbstract() {
		System.out.println("primer contructor hija");
		System.out.println(getAcumuladorCalculos());
	}

	public HijaAbstract(String injectAtributo1Hija, String injectAtributo2Hija) {
		super("valor desde la clase hija a la super");
		this.atributo1Hija = injectAtributo1Hija;
		this.atributo2Hija = injectAtributo2Hija;
		System.out.println("Hola desde constructor clase hija con parametros: " + injectAtributo1Hija + " - " + injectAtributo2Hija);
	}
	
	public HijaAbstract(String injectAtributo1Hija, String injectAtributo2Hija, String injectAtributo3Hija) {
		super("valor desde la clase hija a la super");
		this.atributo1Hija = injectAtributo1Hija;
		this.atributo2Hija = injectAtributo2Hija;
		System.out.println("Hola desde constructor clase hija con parametros: " + injectAtributo1Hija + " - " + injectAtributo2Hija + " " + injectAtributo3Hija);
	}
	
	public void metodoHija(){
		System.out.println("Hola desde metodo hija y mas logica extra del decorador");
		metodoAbstract("hija");
	}
	
}
