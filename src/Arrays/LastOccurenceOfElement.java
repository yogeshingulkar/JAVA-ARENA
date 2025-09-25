package Arrays;
import java.util.*;

public class LastOccurenceOfElement 
{
	static int lastOccurence(int arr[],int element)
	{
		int lastIndex = -1;
		for(int i =0;i< arr.length;i++)
		{
			if(element == arr[i])
			{
				lastIndex = i;
			}
		}
		
		return lastIndex;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int arr [] = new int [n];
		System.out.println("enter the elements  : ");
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(" Enter the element to find the last occurence : ");
		int element = sc.nextInt();
		sc.close();
		System.out.println("last Occurence of element "+ element + " is  at index  : "+ lastOccurence(arr,element));
	}

}
