package Assignment;

import java.util.Scanner;

//Problem STatement 1

public class Circle 
{
	private float radius; //declaring instance variable radius
	static float pi-3.5f;
	
	//default constructor
	Circle()
	{
		
	}
	
	//cons2
	
	Circle(float radius)
	{
		Circle(float radius, float pi)
		{
			
		}
		
		//method
		
		Static float calculateCircumference(float radius) 
		{
			return 2*pi*radius;
			
			
		}
		
		public static void main(String args[])
		{
			Circle obj=new Circle();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the radius");
			float radius=sc.nextFloat();
			
			System.out.println("The area is :"+calculateCircleArea(radius));
			System.out.println("The circumference is:"+clacula);
		}
		
	}

}
