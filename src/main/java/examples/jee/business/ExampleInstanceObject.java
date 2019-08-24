package examples.jee.business;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.New;
import javax.inject.Inject;
import javax.inject.Singleton;

import examples.jee.dto.QFCarro;
import examples.jee.dto.QFTransporte;

@Singleton
public class ExampleInstanceObject {
	
	@Inject
	@QFTransporte
	Instance<Transporte> generic;

	@Inject
	@New(Avion.class)
	Instance<Transporte> avion;

	@Inject
	@QFCarro
	Instance<Transporte> carro;
	
    public String obtenerVelocidadTransporte(){
		
		String a = "";
		
		String avionVelocidad = avion.get().velocidad();
		System.out.println(avionVelocidad);
		
		String carroVelocidad = carro.get().velocidad();
		System.out.println(carroVelocidad);
		
		for (Transporte obj : generic) {
			a = obj.aceleracion();
			System.out.println(a);
		}
		
		return a;
	}

}
