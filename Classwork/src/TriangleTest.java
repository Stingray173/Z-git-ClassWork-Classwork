import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

//	@Test
//	void TestTriangle() {
//		double side = 7;
//		double angle = 60;
//		
//		Triangle t1 = null;
//		try {
//			t1 = new Triangle(side);
//		} catch (Exception e ) {
//			//e.printStackTrace();
//			fail(" TestTriangle Failed ");
//		}
//		//System.out.print(" I am here. ");
				
//		Triangle t1 = new Triangle(side);
//		assertEquals(side, t1.getS2(), 0.01);
//		assertEquals(side, t1.getS2(), 0.01);
//		assertEquals(side, t1.getS2(), 0.01);
//		
//		assertEquals(angle, t1.AngleA(), 0.01, " Angle is not equal to ");
//		assertEquals(angle, t1.AngleB(), 0.01, " Angle is not equal to ");
//		assertEquals(angle, t1.AngleC(), 0.01, " Angle is not equal to ");

		@Test
		void TestTriangle_2() throws Exception {
			double side = 7;
			double angle = 60;
			assertThrows(Exception.class, () -> {
				Triangle t1 = new Triangle(side);
			});
			Triangle t1 = null;
			try {
				t1 = new Triangle(side);
			} catch (Exception e ) {
				//e.printStackTrace();
				fail(" TestTriangle Failed ");
			}
	}

}
