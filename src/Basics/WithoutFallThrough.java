package Basics;
import java.util.*;
public class WithoutFallThrough {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the month");
	String month = sc.next();
		sc.close();
		String op = switch(month)
		{
		case "December","January","February" -> "Winter";
		case "March","April","May"-> "Summer";
		case "June","July","August"-> "Rainy";
		case "Octomber","November" -> "Autum";
		default -> "invalid month";
		};
		System.out.println("The Season is : " + op);
	
	}

}
