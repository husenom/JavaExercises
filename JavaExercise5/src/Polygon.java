// Question number 1, 2, and 3

public class Polygon {
	
	
	// Properties/Attributes
	
	private int sides;
	
	private String color;
	
	// Constructor
	
	public Polygon(int sides, String color) {
		
		this.sides = sides;
		
		this.color = color;
		
	}
	
	// Behaviour/Method	
	
	public void numberOfSides() {
		System.out.println("The polygon has " + sides + " sides");
	}
	
	public void TypeOfcolor() {
		System.out.println("The polygon has " + color + " color");
	}

}
