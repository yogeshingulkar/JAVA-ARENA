package loops;
import java.util.*;
public class SumOfNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting point of range : ");
		int start = sc.nextInt();
		System.out.print("Enter the Ending point of range: ");
		int end = sc.nextInt();
		sc.close();
		int sum = 0;
		while(start <= end)	
		{
			sum += start;
			start++;
		}
	System.out.println("Sum of digit is : " + sum);

	}

}
