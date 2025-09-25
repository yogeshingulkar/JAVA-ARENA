package loops;
import java.util.*;
public class FactorCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		int count = 1;
		int den = 1;
		sc.close();
		while(den <= num/2)
		{
			if(num % den == 0)
			{
				count++;
			}
			
			den++;
		}
		System.out.println(" Count of Factors is : " + count);
	}

}
