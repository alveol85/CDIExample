package example.patter.decorator2;

public class Acumulator2 extends Decorator {
	
	public Acumulator2(Decorator acumulator) {
		super(acumulator);
	}

	@Override
	public int getAcumuladorCalculos() {
		int valorSuma = getAcumulator().getAcumuladorCalculos() + 10;
		setAcumuladorCalculos(valorSuma);
		return valorSuma;
	}

}
