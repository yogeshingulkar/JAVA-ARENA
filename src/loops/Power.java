package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Base : ");
	int base = sc.nextInt();
	System.out.print("Enter the raise :");
	int raise = sc.nextInt();
	int ans = 1;
		sc.close();
	while(raise > 0)
	{
		ans *= base;
		raise--;
	}
System.out.println(ans);
	}

}
