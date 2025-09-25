package loops;
import java.util.*;

public class CountOfDigit 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		sc.close();
		int count = 0;
		
		if(num == 0)
		{
			System.out.println(1);
		}
		else
		{
			while(num > 0)
			{
				count++;
				num /= 10;
				
				
			}
			System.out.println("Count is : " + count);
		}
	}

}
