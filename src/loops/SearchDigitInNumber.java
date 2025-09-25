package loops;
import java.util.*;
public class SearchDigitInNumber 
{

	/* public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the digit to search the give Number : ");
		int digit = sc.nextInt();
		
		sc.close();
		while(num > 0)
		{
			int last = num % 10;
			num /= 10;
			
			if(last == digit)
			{
				System.out.println("Digit is found in Number ");
				System.exit(0);
			}
			
		}
		System.out.println("Digit not found ");
	}
	*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the digit to search the give Number : ");
		int digit = sc.nextInt();
		boolean found = false;
		
		sc.close();
		while(num > 0)
		{
			int last = num % 10;
			num /= 10;
			
			if(last == digit)
			{
				found = true;
			}
			
		}
		
		if(found)
		{
			System.out.print(" Digit is found");
		}
		else
		{
			System.out.println(" Digit is Not found");
		}
	}

}
