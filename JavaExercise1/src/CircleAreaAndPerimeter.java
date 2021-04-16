// Question number 7

public class CircleAreaAndPerimeter {

	public static void main(String[] args) {
		
		double Radius = 7.5, Area1, Area2, Perimeter;
		
		Area1 = Math.PI * Math.sqrt(Radius);
		Area2 = Math.PI * Math.pow(Radius, 2);
		Perimeter = 2 * Math.PI * Radius;
		
		System.out.println(Area1);
		System.out.println(Area2);
		System.out.println(Perimeter);

	}

}
