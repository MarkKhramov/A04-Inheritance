/**
 *@author Mark Khramov
 *Class: CSIS-1410
 *Assignment: A04 Interface 
 */
package a04Interface;

/**
 * This class is used to declare and initialize Square objects.
 */
public class Square extends Rectangle
{
    /**
     * Constructor for the Square class
     * 
     * @param sideLength Side length of this Square.
     */
	public Square(int sideLength) 
	{
		super(sideLength, sideLength);
		// TODO Auto-generated constructor stub
		
	}
	
	/**
	 * Returns the side length of this Square.
	 * 
	 * @return Side length of this Square
	 */
	public int getSide() 
	{
		return super.getLength();
	}
	
	/**
	 * Returns string representation of this Square.
	 */
	@Override
	public String toString() 
	{
		return "Square(" + super.getLength() + ")";
	}
}
