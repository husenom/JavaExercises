// Question number 4 and 5

public class ThreeDimentionalShape extends Polygon {
	
	private int height;
	
	public ThreeDimentionalShape(int sides, String color, int height) {
		super(sides,color);
		this.height = height;
		
	}
	
	public void displayHeight() {
		System.out.println("Height of the three dimensional polygon is "+ this.height);
	}
	

}
