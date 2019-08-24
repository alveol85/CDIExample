package examples.jee.business;

import examples.jee.dto.QFTransporte;

@QFTransporte
public class Avion implements Transporte {

	@Override
	public String velocidad() {
		return "200 km/h";
	}

	@Override
	public String aceleracion() {
		return "100 r/h";
	}

}
