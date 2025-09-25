package Arrays;
import java.util.*;
public class OccurenceOfElement
{
	static int countOccurences( int arr[] ,int element)
	{
		int count = 0;
		for(int i =0 ;i < arr.length;i++)
		{
			if(element == arr[i]) 
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
		System.out.println(" Enter the element to find occurence of element : ");
		int element = sc.nextInt();		
		sc.close();
		System.out.println(" Count of Element " + element + " is  : "+ countOccurences(arr,element) );
		

	}

}
