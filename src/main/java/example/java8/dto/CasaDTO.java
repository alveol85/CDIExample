package example.java8.dto;

public class CasaDTO {

	private String direccion;
	private String barrio;
	private String tipoCocina;
	private String piso;
	private int piezas;
	private int bathrooms;
	
	public CasaDTO() {
		super();
	}

	public CasaDTO(String direccion, String barrio, String tipoCocina, String piso, int piezas, int bathrooms) {
		super();
		this.direccion = direccion;
		this.barrio = barrio;
		this.tipoCocina = tipoCocina;
		this.piso = piso;
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

	public String getTipoCocina() {
		return tipoCocina;
	}

	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}
	
	

}
