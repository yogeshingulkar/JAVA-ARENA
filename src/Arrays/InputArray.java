package Arrays;
import java.util.*;
public class InputArray
{
	static void printArray(int arr [])
	{
		//System.out.print("Array Elements is : ");
		for(int i = 0; i < arr.length;i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}
	void userInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array :");	
		int n = sc.nextInt();
		int arr [] = new int [n];
		System.out.print("Enter the "+ n + " elements : ");
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int [] arr_2 = arr;
		System.out.println("Original array is : ");
		printArray(arr);
		
		System.out.println("\nCopied array is : ");
		printArray(arr_2);
		
		// changing some value of array 2 
		arr_2[0]=0;
		arr_2[1]= 0;
		
		System.out.println("\nOriginal array after changing arr_2  is : ");
		printArray(arr);
		
		System.out.println("\nCopied array  after changing arr_2 is : ");
		printArray(arr_2);
		
		sc.close();
	}
	public static void main(String[] args) {
		InputArray obj = new InputArray();
		obj.userInput();
		
	}

}
