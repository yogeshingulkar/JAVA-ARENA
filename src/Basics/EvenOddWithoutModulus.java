package Basics;
import java.util.*;
public class EvenOddWithoutModulus {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		sc.close();
		String op =( num / 2) * 2 == num  ? "is Even" : "is odd";
		System.out.println(num + " : " + op);
	}

}
