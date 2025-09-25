package loops;
import java.util.*;
public class SumOfDigitProductOfDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number :");
		int num = sc.nextInt();
		int sumOfDigit = 0,productOfDigit = 1;
		sc.close();
		
		
		while(num > 0)
		{
			int last = num % 10;
			sumOfDigit += last;
			productOfDigit *= last;
			num /= 10;
		}
		
		if(sumOfDigit == productOfDigit)
		{
			System.out.println(" Sum of digit & product of digit is same ");
		}
		else
		{
			System.out.println(" Sum of digit & product of digit is not  same ");
		}
	}

}
