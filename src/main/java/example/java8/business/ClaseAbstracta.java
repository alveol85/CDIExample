package example.java8.business;

public abstract class ClaseAbstracta {

	private String atributo1;
	private int acumuladorCalculos;

	public ClaseAbstracta() {
		System.out.println("primer contructor padre");
	}

	public ClaseAbstracta(String atributo1) {
		System.out.println("Hola desde constructor clase padre con parametro; " + atributo1);
		this.atributo1 = atributo1;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public int getAcumuladorCalculos() {
		return acumuladorCalculos;
	}

	public void setAcumuladorCalculos(int acumuladorCalculos) {
		this.acumuladorCalculos = acumuladorCalculos;
	}

	public void metodoAbstract(String atr) {
		System.out.println("Hola desde metodo abstract instancia desde " + atr);
	}

}
