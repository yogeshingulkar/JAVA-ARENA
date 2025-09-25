package loops;
import java.util.*;
public class AlternativeDigitOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number :");
		int num = sc.nextInt();
		sc.close();
		
		while(num > 0)
		{
			System.out.println(num % 10);
			num /= 100;
		}
	}

}
