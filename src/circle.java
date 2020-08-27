
public class circle implements Shape{

	int r = 0;
    double pi = 3.14, ar = 0;
    public void input()
    {
        r = 5;
    }
    
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
	
	
	
}
