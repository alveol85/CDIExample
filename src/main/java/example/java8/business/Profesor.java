package example.java8.business;

public class Profesor extends Persona {

	private Integer legajo;

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public int calularExamen() {
		System.out.println(3 + 3);
		return 3 + 3;
	}

}
