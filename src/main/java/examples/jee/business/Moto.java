package examples.jee.business;

import examples.jee.dto.QFTransporte;

@QFTransporte
public class Moto implements Transporte {

	@Override
	public String velocidad() {
		return "80 km/h";
	}

	@Override
	public String aceleracion() {
		return "40 r/h";
	}

}
