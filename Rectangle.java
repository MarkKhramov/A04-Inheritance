/**
 *@author Mark Khramov
 *Class: CSIS-1410
 *Assignment: A04 Interface 
 */
package a04Interface;

/**
 * This class is used to declare and initialize Rectangle objects.
 */
public class Rectangle implements Shape, Printable 
{
    private final int length, width;

    /**
     * This is the constructor for the Rectangle class.
     * 
     * @param length The length of the Rectangle.
     * @param width  The width of the Rectangle.
     */
	public Rectangle(int length, int width) 
	{
		super();
		this.length = length;
		this.width = width;
	}
    
	/**
	 * This is a getter for the Length of this Rectangle object.
	 * 
	 * @return length The length of this Rectangle.
	 */
	public int getLength() 
	{
		return length;
	}
    
	/**
	 * This is a getter for the Width of this Rectangle object.
	 * 
	 * @return width The width of this Rectangle.
	 */
	public int getWidth() 
	{
		return width;
	}
	
	/**
	 * Returns a string representation of this Rectangle object.
	 */
	@Override
	public String toString() 
	{
		return "Rectangle(" + length + "x" + width + ")";
	}

	@Override
	public void print()
	{
		for(int i = 0; i < length; i++)
		{
		   System.out.print("o ");
		}
		System.out.println();
		
		for(int i = 0; i < width-2 ; i++)
		{
			System.out.print("o");
			for(int i1 = 1; i1 <= 2*length-3; i1++)
			{
				System.out.print(" ");
			}
			System.out.println("o");
		}
		
		for(int i = 0; i < length; i++)
		{
		   System.out.print("o ");
		}
		System.out.println();
	}

	@Override
	public double perimeter()
	{
		return 2 * width + 2 * length;
	}

	@Override
	public double area()
	{
		return width * length;
	}
}