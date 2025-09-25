package loops;
import java.util.*;
public class Factorial {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		
		int fact = 1;
		while(num != 0)
		{
			fact = fact * num;
			num--;
		}
		
		System.out.println(" Factorial of Number : " + fact);
	}

}
