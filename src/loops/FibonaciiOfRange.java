package loops;
import java.util.*;
public class FibonaciiOfRange {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the Starting of Range :" );
	 int start = sc.nextInt();
	 System.out.print("Enter the Ending point of Range : ");
	 int end = sc.nextInt();
	 
	 sc.close();
	 int n1 = 0,n2= 1,n3 = 0;
	 while(n1 <= end)
	 {
		 n3 = n1 + n2;
		 if(n1 >= start)
		 {
			 System.out.print(n1 + " ");
		 }
		 n1 = n2;
		 n2 = n3;
	 }

}
}