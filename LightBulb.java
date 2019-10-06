
public class LightBulb implements Measurable {
	
	private int watts;

	public LightBulb() {}
	
	public LightBulb (int watts) {
		this.watts = watts;
	}

	@Override
	public int getMeasure() {
		return watts;
	}
	
	public String toString() {
		return "This lightbulb has " + getMeasure() + " watts.";
	}

}
