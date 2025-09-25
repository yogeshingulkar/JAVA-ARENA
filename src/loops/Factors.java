package loops;
import java.util.*;
public class Factors 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		
		int den = 1;
		
		while(den <= num/2)
		{
			if(num % den == 0)
			{
				System.out.println(den);
			}
			den++;
			
		}
		 System.out.println(num);
	}
	
}
