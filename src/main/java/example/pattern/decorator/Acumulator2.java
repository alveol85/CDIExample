package example.pattern.decorator;

public class Acumulator2 extends Decorator {
	
	public Acumulator2(IAcumulator acumulator) {
		super(acumulator);
	}

	@Override
	public int getAcumuladorCalculos() {
		int valorSuma = 5 + 10;
		return getAcumulator().getAcumuladorCalculos() + valorSuma;
	}

	@Override
	public String getAtributo1() {
		// TODO Auto-generated method stub
		return getAcumulator().getAtributo1() + " clase hija 2";
	}

}
