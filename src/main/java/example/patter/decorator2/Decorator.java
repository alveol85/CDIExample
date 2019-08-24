package example.patter.decorator2;

public class Decorator {

	private Decorator acumulator;
	private int acumuladorCalculos;
	
	public Decorator() {
	}
	
	public Decorator(Decorator acumulator) {
		setAcumulator(acumulator);
	}

	public Decorator getAcumulator() {
		return acumulator;
	}

	public void setAcumulator(Decorator acumulator) {
		this.acumulator = acumulator;
	}
	
	public void setAcumuladorCalculos(int acumuladorCalculos) {
		this.acumuladorCalculos = acumuladorCalculos;
	}

	public int getAcumuladorCalculos() {
		return acumuladorCalculos;
	}


}
