public class TestRectangle {

	public static void main(String[] args) {
		/** Main method */
		
		//Create rectangle
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("First Rectangle " + "\nWidth: " + rectangle1.width + "\nHeight: " + rectangle1.height + "\nArea: " + rectangle1.getArea() + "\nPerimeter: " + rectangle1.getPerimeter() +"\n");
		
		/** \n sets info to next line without having to make more println */
		
		//Create second rectangle
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("Second Rectangle " + "\nWidth: " + rectangle2.width + "\nHeight: " + rectangle2.height + "\nArea: " + rectangle2.getArea() + "\nPerimeter: " + rectangle2.getPerimeter());

	}
}

class Rectangle 
{
	double width;
	double height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}
	
	//Return area of of rectangle
	double getArea()
	{
		return width * height;
	}
	
	//Return perimeter of rectangle
	double getPerimeter()
	{
		return 2 * (width + height);
	}
	
	/** Set a new width for this rectangle */
	void setValue(double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}
	
}


