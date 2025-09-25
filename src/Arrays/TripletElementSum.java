package Arrays;

import java.util.Scanner;

public class TripletElementSum 
{
public static int tripletSum(int arr [] ,int target)
{
	int n = arr.length;
	int count =0;
	for(int i =0;i<n;i++)
	{
		for(int j = i+1;j<n;j++)
		{
			for(int k = j+1; k < n;k++)
			{
				if(arr[i] + arr[j] + arr[k] == target)
				{
					count++;
				}
			}
		}
		
	}
	return count;
}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" enter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println(" enter the array elements : ");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();		
		}
		System.out.println(" Enter the target :");
		int target = sc.nextInt();
		
		System.out.println(" count of triplet equals to target : " +tripletSum(arr,target) );
		sc.close();

	}

}
