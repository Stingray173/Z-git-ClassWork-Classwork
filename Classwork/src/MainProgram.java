import java.util.ArrayList;

// Name: Vraj.Patel.
// Class: 164-450.
// Instructor: Bert.Gibbons.

public class MainProgram {
	public static void main (String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Triangle(7));
		
		for (Shape s : shapes) {
			if (s instanceof Shape)
				System.out.println(" this is a shape. ");
			if (s instanceof Rectangle)
				System.out.println(" this is a rectangle. ");
			if (s instanceof Triangle)
				System.out.println(" this is a triangle. ");
			System.out.print(" ");
		}
		
//		Rectangle rec1 = new Rectangle(20, 10); // New means calling the constructor implicitly.
//		
//		// Setting the value of the length and the width.
//		rec1.setLength(40);
//		rec1.setWidth(30);
//		
//		// Displaying the area and the perimeter of the area.
//		System.out.println(rec1.Area());
//		System.out.println(rec1.Perimeter());
	}

}
