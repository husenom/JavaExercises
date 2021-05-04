// Question number 1, 2, 3, and 4

public class PlygonMain {

	public static void main(String[] args) {
		
		Polygon triangle = new Polygon(3, "Red");
		Polygon rectangle = new Polygon(4, "Purple");
		Polygon polygon = new Polygon(5, "Green");
		
		triangle.numberOfSides();
		triangle.TypeOfcolor();
		
		rectangle.numberOfSides();
		rectangle.TypeOfcolor();
		
		polygon.numberOfSides();
		polygon.TypeOfcolor();
		
		ThreeDimentionalShape rectangularThreeD = new ThreeDimentionalShape(6, "Blue", 10);
		
		rectangularThreeD.numberOfSides();
		rectangularThreeD.TypeOfcolor();
		rectangularThreeD.displayHeight();
		

	}

}
