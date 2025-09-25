package Arrays;
import java.util.*;

public class SecondMaxElement
{
	static int findMax(int arr[])
	{
		int mx = Integer.MIN_VALUE;
		for(int i = 0; i <arr.length ; i++)
		{
			if(arr[i] > mx)
			{
				mx = arr[i];
			}
		}
		return mx;
	}
	
	static int findSecondMax(int arr [])
	{
		int mx = findMax(arr);
		int n = arr.length;
		for(int i = 0; i<n;i++)
		{
			if(arr[i] == mx)
			{
				arr[i] = Integer.MIN_VALUE;
			}
			
			
		}
		int secondMx = findMax(arr);  
		
		return secondMx;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of an array : ");
		int n = sc.nextInt();
		
		int arr [] = new  int [n];
		
		System.out.println(" Enter the element in array : ");
		for(int i = 0 ; i<n;i++)
		{
			arr[i] = sc.nextInt();		
		}
		sc.close();
		System.out.printf(Arrays.toString(arr) + " %nSecond Max Element array is : " + findSecondMax(arr));
		

	}

}
