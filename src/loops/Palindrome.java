package loops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		
		int ans = 0;
		for(int i = num; i != 0;i/= 10)
		{
			ans = ans * 10 + (i % 10);
		}
		if(num == ans)
		{
			System.out.println("It is  Palindrome ");
		}
		else
		{
			System.out.println("It is not Palindrome ");
		}
	
	}

}
