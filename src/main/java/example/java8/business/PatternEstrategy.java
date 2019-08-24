package example.java8.business;

public class PatternEstrategy {
	
	public void accion(Persona p){
		
		if(p instanceof Alumno){
			((Alumno) p).calcularPromedio();
			p.buscarLibro();
		}
		
		if(p instanceof Profesor){
			((Profesor) p).calularExamen();
			p.buscarLibro();
		}
		
	}

}
