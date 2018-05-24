// Name: Vraj.Patel.
// Class: 164-450.
// Instructor: Bert.Gibbons.

public final class Rectangle extends Shape {
	// Final here means that it cannot be extended.
		
	private int length; // You can only see this in the class, and not anywhere outside of it.
	private int width;
	
//	public Rectangle(double length, double width) // You can have same constructor name, but with parameters having different data types. 
//	{
//		//this.length = length; // This length means that the length in this class.
//		//this.width = width;
//	}
//	public Rectangle(int length, int width) // Constructor.
//	{
//		this.length = length; // This length means that the length in this class.
//		this.width = width;
//	}
//		
//	
	
		
	public Rectangle(int length, int width)
	{
	super();
	this.length = length;
	this.width = width;
	}
	
	// Getters and setters for the length of the rectangle.
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	// Getters and setter for the width of the rectangle.
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	// Method for area.
	public double Area () 
	{
		// This calculates and returns the area of the rectangle.
		return (double) length * width;
	}
	
	// Method for perimeter.
	public double Perimeter() // This line here is method signature.
	{ // This line and the next two lines are method implementation.
		// This calculates and returns the perimeter of the rectangle.
		return (double) 2 * (length + width);
	}
	
	
// Multiple ways to see if it is a square.
//	public boolean isSquare() {
//	boolean isSquare = false;
//	if (this.length == this.width){
//		isSquare = true;
//	}
//	return isSquare;
//	}
	
	public boolean isSquare() {
		return (this.length == this.width);
	}
	
	public boolean AreSidesEqual()
	{
		return isSquare();
	}
}
		
	

