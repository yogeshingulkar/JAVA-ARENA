package Arrays;

public class SumOfAllArrayElements 
{
	void sumOfElements()
	{
		int sum = 0;
			int [] arr = {10,30,50,60};
			for(int i = 0; i< arr.length;i++)
			{
					sum += arr[i];
			}
			
			System.out.println(" Sum of Array elements is : " + sum);
	}
	public static void main(String[] args) 
	{
		
		SumOfAllArrayElements obj = new SumOfAllArrayElements();
		obj.sumOfElements();
		
	}

}
