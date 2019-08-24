package example.pattern.decorator;

public abstract class Decorator implements IAcumulator {

	private IAcumulator acumulator;

	public Decorator(IAcumulator acumulator) {
		setAcumulator(acumulator);
	}

	public IAcumulator getAcumulator() {
		return acumulator;
	}

	public void setAcumulator(IAcumulator acumulator) {
		this.acumulator = acumulator;
	}

}
