package example.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import example.java8.dto.CasaBasicoDTO;

public class ProxyExampleInvocationHandler implements InvocationHandler {
	
	private ExampleProxyRefletion exampleProxyRefletion;

	public ProxyExampleInvocationHandler(ExampleProxyRefletion exampleProxyRefletion) {
		this.exampleProxyRefletion = exampleProxyRefletion;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ejecucion del proxy al principio");
		
		CasaBasicoDTO casaBasico = new CasaBasicoDTO();
		casaBasico.setBarrio("Manchester");
		casaBasico.setDireccion("Cra 48");
		 
		Object out = method.invoke(new ExampleProxyRefletion(casaBasico), args);
		System.out.println("finalizacion del proxy");
		return out;
	}

}
