package loops;
import java.util.*;
public class SumofEvenOddDigits {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		
		int evenOfSum = 0;
		int oddOfSum = 0;
		
		while(num > 0)
		{
			int  last = num % 10;
			
			if(last % 2 == 0)
			{
				evenOfSum += last;
			}
			else
			{
				oddOfSum += last;
			}
			num /= 10;
		}
		
		if(evenOfSum == oddOfSum)
		{
			System.out.println(" It is a Balance Number ");
		}
		else 
		{
			System.out.println(" It is not a Balance Number ");
		}
	}

}
