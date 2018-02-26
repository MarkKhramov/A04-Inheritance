/**
 *@author Mark Khramov
 *Class: CSIS-1410
 *Assignment: A04 Interface 
 */
package a04Interface;

/**
 * This class is used to declare and initialize IsoscelesRightTriangle objects.
 */
public class IsoscelesRightTriangle implements Shape, Printable 
{
	
    private final int leg;

    /**
     * Constructor for the IsoscelesRightTriangle class.
     * 
     * @param leg Leg length of this triangle
     */
	public IsoscelesRightTriangle(int leg) 
	{
		super();
		this.leg = leg;
	}
	
	/**
	 * Calculates and returns the length of the hypotenuse using the Pythagorean theory.
	 *
     * @return The hypotenuse of this Triangle.
	 */
	public double hypotenuse() 
	{
		return Math.sqrt(Math.pow(leg, 2) + Math.pow(leg, 2));
	}
	
	/**
	 * Getter for the Leg value of this triangle.
	 * 
	 * @return leg The Leg value of this triangle.
	 */
	public int getLeg() 
	{
		return leg;
	}
	
	/**
	 * Returns a string representation of this Triangle object.
	 */
	@Override
	public String toString() 
	{
		return "IsoscelesRightTriangle(" + leg + ")";
	}

	@Override
	public double perimeter()
	{
		// TODO Auto-generated method stub
		return 2 * leg + hypotenuse();
	}

	@Override
	public double area()
	{
		// TODO Auto-generated method stub
		return Math.pow(leg, 2) / 2;
	}

	@Override
	public void print()
	{
		// TODO Auto-generated method stub
		System.out.println("o");
		for(int i = 1; i < leg-1; i++) 
		{
		    System.out.print("o");
		    for(int q = i; q > 0; q--) 
		    {   
		    	if(q==1)
		    	{
		    	   System.out.print(" ");	
		    	}
		    	else
		    	{
		    	   System.out.print("  ");
		    	}
		    	
		    }
		    System.out.println("o");
		}
		for(int i = 1; i<leg+1; i++) 
		{
			System.out.print("o");
			System.out.print(" ");
		}
		System.out.println();
		
	}
	
	
}
