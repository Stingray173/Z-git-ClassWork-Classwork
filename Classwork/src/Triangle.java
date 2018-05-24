// Name: Vraj.Patel.
// Class: 164-450.
// Instructor: Bert.Gibbons.

public class Triangle extends Shape{
	
	private double s1;
	private double s2;
	private double s3;
	
	// Same method in the same class is called overloading.
	
	// Creating a triangle with three different sides.
	public Triangle(double side1, double side2, double side3) throws Exception
	{
		this.s1 = side1;
		this.s1 = side2;
		this.s3 = side3;
		
		if (SquareArea() < 0) {
			throw new Exception(" Illegal Triangle. ");
		}
	}
	
	// Creating a triangle with three same sides.
	public Triangle(double side) 
	{
		this.s1 = side;
		this.s2 = side;
		this.s3 = side;
	}
	
	// Creating a triangle with two sides and one angle.
	public Triangle(double side2, float angle, double side3) 
	{
		double side1 = Math.pow(side2, 2) + Math.pow(side3, 2) - ((2 * side2 * side3) * Math.cos((double)angle));
		this.s2 = side2;
		this.s3 = side3;
		this.s3 = Math.sqrt(s1);
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}
	
	public double AngleA() 
	{
		// AngleA = Angle between side 2 and side 3.
		double a = (Math.pow(this.s2, 2) + Math.pow(this.s3, 2) - Math.pow(this.s1, 2)) / (2 * this.s2 * this.s3); 
		return Math.acos(a) * (180 / Math.PI);
	}
	
	public double AngleB() 
	{
		// AngleB = Angle between side 1 and side 3.
		double b = (Math.pow(this.s1, 2) + Math.pow(this.s3, 2) - Math.pow(this.s2, 2)) / (2 * this.s1 * this.s3); 
		return Math.acos(b) * (180 / Math.PI);
	}
	
	public double AngleC() 
	{
		// AngleC = Angle between side 1 and side 2.
		double c = (Math.pow(this.s1, 2) + Math.pow(this.s2, 2) - Math.pow(this.s3, 2)) / (2 * this.s1 * this.s2); 
		return Math.acos(c) * (180 / Math.PI);
	}
	
	public double Perimeter()
	{
		return (s1 + s2 + s3);
	}
	
	private double HalfPerimeter()
	{
		return (Perimeter() / 2);
	}
	
	private double SquareArea()
	{
		return this.HalfPerimeter() * (this.HalfPerimeter() - this.s1) * (this.HalfPerimeter() - this.s2) * (this.HalfPerimeter() - this.s3);
	}
	
	public double Area()
	{
		return Math.pow((SquareArea()), 0.5);
	}

	public boolean AreSidesEqual()
	{
		boolean isEqual = false;
		
		if ((this.s1 == this.s2) && (this.s2 == this.s3) && (this.s1 == this.s3)){
			
			isEqual = true;
		}
		return isEqual;
	}
}
