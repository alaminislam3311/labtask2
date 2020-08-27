
public class triangle  extends Square {

	public static void main(String args[]) {   
	      Scanner scanner = new Scanner(System.in);

	      System.out.println("Enter the width of the Triangle:");
	      double base = scanner.nextDouble();

	      System.out.println("Enter the height of the Triangle:");
	      double height = scanner.nextDouble();

	 
	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);      
	   }
	
	 Rectangle obj = new Rectangle();
     obj.input();
     obj.area();
     obj.boundary_len();
	
}
