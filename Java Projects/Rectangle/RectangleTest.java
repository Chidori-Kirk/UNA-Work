
public class RectangleTest {
	public static void main (String [] args) {
		Rectangle myRectangle = new Rectangle(4.0, 40.0);
		//Rectangle myRectangle1 = new Rectangle(3.5, 35.90);
		
		System.out.println("Before the change:");
		System.out.println("");
		System.out.printf("The rectangle's width is %.2f and its height is %.2f.\n", myRectangle.getWidth(), myRectangle.getHeight());
		System.out.printf("Its area is %.2f and its perimeter is %.2f.\n", myRectangle.getArea(), myRectangle.getPerimeter());
		myRectangle.setWidth(3.50);
		myRectangle.setHeight(35.90);
		System.out.println("");
		System.out.println("After the change:");
		System.out.println("");
		System.out.printf("The rectangle's width is %.2f and its height is %.2f.\n", myRectangle.getWidth(), myRectangle.getHeight());
		System.out.printf("Its area is %.2f and its perimeter is %.2f.", myRectangle.getArea(), myRectangle.getPerimeter());
	}
}
