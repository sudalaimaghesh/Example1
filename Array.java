//Array
// Another line added on text
import java.util.*;
public class Array
{



public static void main(String args[])
{

	Scanner scn = new Scanner(System.in); //it is calling to the constructor of scanner class
	int numbers[]= new int[10];
	int counter; 
	int sum=0;
	System.out.println("Enter 10 Numbers");
	for(counter=0; counter<10; counter++)
	{
		numbers[counter]=scn.nextInt();	
	}

	System.out.println("The 10 Numbers are");
	
	for(counter=0; counter<10; counter++)
	{
		System.out.println("numbers[counter]");
		sum = sum +numbers[counter];
	}
	System.out.println("The sum of 10 numbers: " +sum);
}
}