import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void RectangleTestArea() {
		
		int width = 10;
		int length = 20;
		double area = 200;
		double perimeter = 60;
		Rectangle rec1 = new Rectangle(length, width);
		
		// When you have a green bar(the green bar to the left.) it tell that all the asserts worked.
		
		assertEquals(area, rec1.Area(),0.01); // area is expected value, and rec1.Area is the calculated value.
		assertEquals(perimeter, rec1.Perimeter(),0.01); // 0.01 tells to only check for two decimal places.
		
		
	}

	@Test
	public void RectangleIsSquare() {
		int width = 10;
		int length = 20;
		Rectangle rec1 = new Rectangle(length, width);
		
		assertFalse(rec1.isSquare());
		rec1.setWidth(20);
		
		assertTrue(rec1.isSquare());
		
	}
}
	

