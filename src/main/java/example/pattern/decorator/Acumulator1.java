package example.pattern.decorator;

public class Acumulator1 extends Decorator {
	
	public Acumulator1(IAcumulator acumulator) {
		super(acumulator);
	}

	@Override
	public int getAcumuladorCalculos() {
		int valorResta = 4;
		return getAcumulator().getAcumuladorCalculos() - valorResta;
	}

	@Override
	public String getAtributo1() {
		// TODO Auto-generated method stub
		return getAcumulator().getAtributo1() + " clase hija";
	}

}
