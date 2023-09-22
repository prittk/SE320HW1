import java.util.InputMismatchException;
import java.util.Scanner;
//This program takes in two input integergers from a user and adds them together. If the inpu
//isnt an integer, the program catches the error and has the user try again
public class Sum {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		 int x = 0;
		 int y = 0;
		
		System.out.println("Enter in the first digit for addition");
		x = ChooseNum();
		System.out.println("X ="+x + " Y="+y);
		System.out.println("Enter in the second digit for addition");
		y= ChooseNum();
		System.out.println("X ="+x + " Y="+y);
		Addition(x,y);
		scan.close();
	}
	
	public static int ChooseNum()
	{
		
		boolean NotInt = false;
		int NumAssigned=0;
		
		do// loop to make sure user enters an integer, makes user to change if wrong. 
		{
			NotInt=false;
				try
				{
				NumAssigned = scan.nextInt();
				
				
				}
			catch(InputMismatchException ex)
			{
				NumAssigned=0;
				scan.nextLine();
				System.out.println("that isnt an Integer, try again");
				NotInt =true;
			}
		
		}while(NotInt);
		return NumAssigned;
	}
	//prints the added numbers
	public static void Addition(int x, int y)
	{
		System.out.print(""+(x+y));
	}

}
