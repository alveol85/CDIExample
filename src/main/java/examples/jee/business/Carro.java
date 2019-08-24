package examples.jee.business;

import examples.jee.dto.QFCarro;
import examples.jee.dto.QFTransporte;

@QFTransporte @QFCarro
public class Carro implements Transporte {

	@Override
	public String velocidad() {
		return "120 km/h";
	}

	@Override
	public String aceleracion() {
		return "60 r/m";
	}

}
