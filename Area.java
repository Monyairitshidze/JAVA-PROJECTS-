

//create a class to caluclate area and perimeter of the rectangle
public class Area {
	
	  int length;
	 int width;

	 Area(int l, int w) {
		this.length = l;
		this.width = w;
		
	}
	
 Area() {
	 this(5,3);
		
	}
 
 public int calculateArea() {
	 
	 return length*width;
 }
 
 
public  int calculatePerimeter() {
	 
	 return 2 *( length+width);
 }

	public static void main(String[] args) {
		
		Area a1 = new Area(2,4);
		Area a2 = new Area();
		
		System.out.println("The  first area is: " + a1.calculateArea());
		System.out.println("The second area is: " +a2.calculateArea() );
		System.out.println("The  first parameter is: " + a1.calculatePerimeter());
		System.out.println("The second parameter is: " +a2.calculatePerimeter() );
		

	}

}
