package loops;
import java.util.*;

public class XylemPhloemNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		sc.close();
		
		int sumOfEnd = num %10;
		num/=10;
		int sumOfMid = 0;
		while(num > 9)
		{
			sumOfMid = sumOfMid+ (num %10); 
			num /= 10;
		}
		sumOfEnd = sumOfEnd + num;
		
		if(sumOfEnd == sumOfMid)
		{
			System.out.println("Xylem Number ");
		}
		else {
			System.out.println("Phloem Number ");
		}
	}

}
