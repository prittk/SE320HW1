import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//This program creates an array of 100 random numbers and allows the user to pick an element from the array
//if the element is out of bounds, the program catches it and asks the user to try again
public class RandArrayGen {
	static int[] RandomArray = new int[100];
	static Scanner scanner = new Scanner(System.in);
	public static void main(String [] args)
	{
		randomGen();
		
	}
	//generates a random array 0 to 100
	public static void randomGen()
	{
	int i;
	Random rand = new Random();
	int Element;

	for (i =0; i<100; i++)
	{
		Element = rand.nextInt(100-0)+0;
		RandomArray[i] = Element;
		System.out.print(RandomArray[i]+"\n");
	}
	pickElement();
	}
	
	//asks user to pick element
	public static void pickElement()
	{
		boolean y = false;
		String check = null;
	//loop to check array until user is done
		do {
			y=false;
		try
		{
			
			System.out.println("Enter desired element from random integer array of 0-99");
			int desiredElement = scanner.nextInt();
			System.out.println("This is located at position " + desiredElement+" an contains element: "+RandomArray[desiredElement]);
			
		}
		catch (ArrayIndexOutOfBoundsException|InputMismatchException e)
		{
			System.out.println("Desired element is out of bound of array");
		}
		
		System.out.println("Do you want to pick another number?");
		System.out.println("Enter Y for yes");
		scanner.nextLine();
		check=scanner.next();
		if (check.equals("y")||check.equals("Y"))
			{
			y=true;
			}
			else
			{
			System.out.println("Something other than yes was chosen, clsoing system");
			}
		}while(y);
		scanner.close();
	}
	
}
