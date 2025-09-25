package Arrays;

import java.util.Scanner;

public class SumOfTwo
{
	public static int printSum(int arr[],int target)
	{
		int n = arr.length;
		int count = 0;
		for(int i = 0; i<n;i++)
		{
			for(int j = i+1;j <n ;j++ )
			{
				if(arr[i] + arr[j] == target)
				{
					count++;
				}
			}
			
		}
		return count;
	}
	public static void main(String [] args)
	{	
		Scanner  sc = new Scanner(System.in);
		System.out.println(" Enter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new   int [n];
		System.out.println(" enter the array element ");
		for(int i = 0;i<n;i++)
		{
				arr[i] = sc.nextInt();
		}
		
		System.out.println(" count of sum of element in target sum : " + printSum(arr,7));
			sc.close();
		
	}
}
