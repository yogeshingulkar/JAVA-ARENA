package loops;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int den = 2;
		sc.close();
		while(den < num)
		{
			if(num % den == 0)
			{
				break;
			}
			den++;
		}
		
		if(num == den)
		{
			System.out.println("It is Prime ");
		}
		else {
			System.out.println("It is Not Prime ");		
			}
		
		
		

	}

}
