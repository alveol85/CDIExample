package examples.jee.services;

import java.lang.reflect.Proxy;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import example.java8.dto.CasaBasicoDTO;
import example.pattern.proxy.ExampleProxyRefletion;
import example.pattern.proxy.IExampleProxyRefletion;
import example.pattern.proxy.ProxyExampleInvocationHandler;
import examples.jee.business.Audit;
import examples.jee.business.ClassToDecorateSellers;
import examples.jee.business.ClassToIntercept;
import examples.jee.business.ClassToIntercept2;
import examples.jee.business.ExampleEventCDI;
import examples.jee.business.ExampleInstanceObject;
import examples.jee.dto.SellerDecoratorDTO;

@Path("examplesJEE7")
@ApplicationScoped
public class serviceExamplesJEE {
	
	@Inject
	ClassToIntercept classToIntercept;
	
	@Inject
	ClassToIntercept2 classToIntercept2;
	
	@Inject
	ExampleInstanceObject exampleInstanceObject;
	
	@Inject
	ClassToDecorateSellers classToDecorateSellers;
	
	@Inject
	ExampleEventCDI exampleEventCDI;
	
	@Path("exampleInstanceObject")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String obtenerVelocidadTransporte(){
		return exampleInstanceObject.obtenerVelocidadTransporte();
	}
	
	@Path("exampleEventObserverCDI")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void libraryDevolution(){
		exampleEventCDI.libraryDevolution();
	}
	
	// http://localhost:8080/CDIExample/rest/examplesJEE7/interceptorExample
	
	@Path("interceptorExample")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void interceptorExample(){
		classToIntercept.intercepMethodCalculateTotalPrice(2);
		classToIntercept.anotherMethodWithoutIntercept("Alex");
		classToIntercept2.intercepMethodCalculateTotalPrice(2,"locomia");
	}
	
	// http://localhost:8080/CDIExample/rest/examplesJEE7/decoratorExample
	
	@Path("decoratorExample")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void decoratorExample(){
		SellerDecoratorDTO sellerDecorator = classToDecorateSellers.caculatePrice(3);
		System.out.println(sellerDecorator.getTotalValue());
	}
	
	@Path("proxyExample")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void proxyExample(){
		
//		CasaBasicoDTO casaBasico = new CasaBasicoDTO();
//		ExampleProxyRefletion exampleProxyRefletion = new ExampleProxyRefletion(casaBasico);
		
		ExampleProxyRefletion exampleProxyRefletion = null;
		
		ProxyExampleInvocationHandler handler = new ProxyExampleInvocationHandler(exampleProxyRefletion);
		
		IExampleProxyRefletion exampleProxy = (IExampleProxyRefletion) Proxy.newProxyInstance(
				IExampleProxyRefletion.class.getClassLoader(),
	            new Class[] {IExampleProxyRefletion.class},
	            handler);
		
		String out = exampleProxy.methodProxied();
		System.out.println(out);
	}

}
