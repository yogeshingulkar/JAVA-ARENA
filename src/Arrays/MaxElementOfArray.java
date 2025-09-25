package Arrays;

public class MaxElementOfArray 
{
		void maxElement()
		{
			int arr [] = {10,30,70,909,45,1078,780};
			int ans = 0;
			
			for(int i = 0; i< arr.length;i++)
			{
					if(ans < arr[i])
					{
						ans = arr[i];
					}
			}
			System.out.println("Max Element of Array : "+ ans);
		}
	public static void main(String[] args) {
		MaxElementOfArray obj = new MaxElementOfArray();
		obj.maxElement();

	}

}
