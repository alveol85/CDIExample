package example.java8.dto;

public class CasaBasicoDTO {

	private String direccion;
	private String barrio;
	private int piezas;
	private int bathrooms;

	public CasaBasicoDTO() {
	}

	public CasaBasicoDTO(String direccion, String barrio, int piezas, int bathrooms) {
		this.direccion = direccion;
		this.barrio = barrio;
		this.piezas = piezas;
		this.bathrooms = bathrooms;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public int getPiezas() {
		return piezas;
	}

	public void setPiezas(int piezas) {
		this.piezas = piezas;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

}
