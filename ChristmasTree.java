
public class ChristmasTree implements Measurable {
	private int height;

	public ChristmasTree() {}
	
	public ChristmasTree(int height) {
		this.height = height;
	}

	@Override
	public int getMeasure() {
		return height;
	}
	
	public String toString() {
		return "This christmas tree is " + getMeasure() + " inches tall.";
	}
	
	

}
