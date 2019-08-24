package example.pattern.decorator;

public class InitAcumulator extends Decorator {

	public InitAcumulator(IAcumulator acumulator) {
		super(acumulator);
	}

	@Override
	public int getAcumuladorCalculos() {
		return 5;
	}

	@Override
	public String getAtributo1() {
		// TODO Auto-generated method stub
		return "inicia el valor";
	}

}
