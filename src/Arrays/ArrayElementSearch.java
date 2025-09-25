package Arrays;

public class ArrayElementSearch 
{
	void searchElement()
	{
		int arr [] = {10,56,34,78,56,90};
		int element = 56;
		int ans = -1;
		for(int i = 0 ; i<arr.length;i++)
		{
			if(element == arr[i])
			{
				ans = i;
				break;
			}
			
			
		}
		if(ans == -1)
		{
			System.out.println(" Element not found in array ");
		}
		else {
				System.out.println("Found Element  "+ element + " at "+ ans + " index");
			}
		
		
	}
	public static void main(String[] args)
	{
		ArrayElementSearch obj = new ArrayElementSearch();
		obj.searchElement();
		
	}

}
