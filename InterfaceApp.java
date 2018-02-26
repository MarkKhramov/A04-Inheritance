/**
 *@author Mark Khramov
 *Class: CSIS-1410
 *Assignment: A04 Interface 
 */
package a04Interface;

/**
 *  This class tests the Interface functionality of java.
 */
public class InterfaceApp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Shape[] shapes = {new Rectangle(6,3), new Rectangle(5,4), new Square(4), new Square(3), new IsoscelesRightTriangle(5), new IsoscelesRightTriangle(3), new Circle(7), new Circle(2)};
       
       System.out.println("Shape Array:");
       System.out.println("-----------");
       
       for(Shape el: shapes) 
       {
           System.out.println(el.toString());
           System.out.printf("Perimeter %.1f%n", el.perimeter());
           System.out.printf("Area: %.1f%n", el.area());
           
           if(el instanceof Printable) 
           {
        	   ((Printable) el).print();
           }
           
           System.out.println();
       }
	}

}
