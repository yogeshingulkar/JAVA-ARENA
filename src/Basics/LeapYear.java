package Basics;
import java.util.*;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Year : ");
		int year = sc.nextInt();
		sc.close();
		
		if((year % 4 == 0 ) && (year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println(year + " Is Leap Year ");
		}
		else {
			System.out.println(year + " Is Not Leap Year ");
		}
	}

}
