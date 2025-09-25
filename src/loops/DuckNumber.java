package loops;
import java.util.*;
public class DuckNumber {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		sc.close();
		
		while(num > 0)
		{
			if(num % 10 == 0)
			{
			
				break;
			}
			num /= 10;
		}
		
		if(num == 0)
		{
			System.out.println("Not  Duck Number ");
		}
		else {
			System.out.println(" Duck number ");
		}
		
	}

}
