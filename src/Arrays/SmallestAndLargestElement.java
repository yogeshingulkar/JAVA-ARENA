package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestElement
{
	static int[] SmallestAndLargest(int[] arr)
	{
		Arrays.sort(arr);
		int []  ans  = {arr[0],arr[arr.length-1]};
		return ans;
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
			arr[i] = sc.nextInt();
		}
		sc.close();
		int result [] = SmallestAndLargest(arr);
		System.out.println("The Smallest Element is : " + result[0]);
		System.out.println("The largest  Element is : " + result[1]);

	}

}
