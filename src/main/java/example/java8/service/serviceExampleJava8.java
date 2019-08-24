package example.java8.service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import example.java8.business.Alumno;
import example.java8.business.ClaseAbstracta;
import example.java8.business.HijaAbstract;
import example.java8.business.IOperations;
import example.java8.business.LambdaExample;
import example.java8.business.PatternEstrategy;
import example.java8.business.Persona;
import example.java8.business.Profesor;
import example.pattern.decorator.Acumulator1;
import example.pattern.decorator.Acumulator2;
import example.pattern.decorator.Decorator;
import example.pattern.decorator.IAcumulator;
import example.pattern.decorator.InitAcumulator;

@Path("examplesJava8")
public class serviceExampleJava8 {
	
	@Inject
	private LambdaExample lambdaExamples;
	
	@Inject
	private PatternEstrategy strategy;
	
	@Path("execLambdaExamples")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void execLambdaExamples(){
		lambdaExamples.execLambdaExamples();
	}
	
	@Path("patternDesingEstrategy")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void execEstrategy(){
		
		Persona profesor = new Profesor();
		strategy.accion(profesor);
		
		Persona alumno = new Alumno();
		strategy.accion(alumno);
		
		Persona per = new Persona();
		strategy.accion(per);
	}
	
	@Path("constructorSuperExample")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void superConstructorExample(){
		
		String injectAtributo1Hija = " parametro hija 1";
		String injectAtributo2Hija = " parametro hija 2";
		ClaseAbstracta ca = new HijaAbstract(injectAtributo1Hija, injectAtributo2Hija);
		
		ClaseAbstracta ca2 = new HijaAbstract();
		ca2.metodoAbstract("padre");
		
		//Ejemplo @FunctionalInterface
				IOperations operation = (int a, int b) -> { 
					int resultado = a + b;
					return resultado;
				};
		
		System.out.println(operation.suma(10, 23));
	}
	
	@Path("patternDesingAcumulator")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public void execAcumulator(){
		
		IAcumulator acumulator = new IAcumulator() {
			
			@Override
			public String getAtributo1() {
				return "iniciacion ";
			}
			
			@Override
			public int getAcumuladorCalculos() {
				return 0;
			}
		};
		
		Decorator decorator = new InitAcumulator(acumulator);
		decorator = new Acumulator2(decorator);
		decorator = new Acumulator1(decorator);
		
		System.out.println(decorator.getAcumuladorCalculos());
		
//		Decorator acumulator = new Decorator();
//		acumulator.setAcumuladorCalculos(10);
//		acumulator = new Acumulator2(acumulator);
//		acumulator = new Acumulator1(acumulator);
		
		
		System.out.println(acumulator.getAcumuladorCalculos());
		
	}

}
