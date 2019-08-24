package example.patter.decorator2;

public class InitAcumulator extends Decorator {

	public InitAcumulator(Decorator acumulator) {
		super(acumulator);
	}

	@Override
	public int getAcumuladorCalculos() {
		return 5;
	}

}
