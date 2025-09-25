package loops;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		int rev = 0;
		while(num != 0)
		{
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		
		System.out.println("Reverse : " + rev);
		
		
		// using for loop
		
		for(int i = num ; i > 0 ; i /= 10)
		{
			rev = rev * 10 + (num % 10);
		}
		
		System.out.println("Reverse : " + rev);
	}

}
