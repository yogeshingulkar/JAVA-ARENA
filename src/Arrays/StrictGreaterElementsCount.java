package Arrays;
import java.util.*;

public class StrictGreaterElementsCount 
{

		static int strictlyGreater(int arr[] ,int element)
		{
			int count = 0;
			for(int i =0 ; i<arr.length;i++)
			{
				if(element < arr[i])
				{
					count++;
				}
			}
			return count;
		}
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println(" Enter the size of array : ");
		int n = sc.nextInt();
		int arr [] = new int [n];
		System.out.println(" Enter the "+ n + " Elements in array : ");
		for(int i =0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt() ;
		}
		System.out.println(" Enter the element to find strictly greater than the element : ");
		int element = sc.nextInt();		
		sc.close();
		System.out.println(" Count Strictly greater than Element " + element + " is  : "+ strictlyGreater(arr,element) );
		
	

	}

}
