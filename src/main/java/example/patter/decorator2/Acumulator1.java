package example.patter.decorator2;

public class Acumulator1 extends Decorator {
	
	public Acumulator1(Decorator acumulator) {
		super(acumulator);
	}

	public int getAcumuladorCalculos() {
		int valorResta = getAcumulator().getAcumuladorCalculos() - 5;
		setAcumuladorCalculos(valorResta);
		return valorResta;
	}

}
