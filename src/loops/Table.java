package loops;
import java.util.*;
public class Table {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the number : ");
		int num = sc.nextInt();
		int count = 1;
		sc.close();
		while(count <= 10)
		{
			System.out.println(num + " * " +count +" = " + (num *  count) );
			count++;
		}
		

	}

}
