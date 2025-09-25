package Arrays;

public class ArrayExample 
{
	void multiarrays()
	{
		int [][] arr1 = new int [5][3];
		arr1[0][1]=20;
		int [][] arr2 = {{56,65,54},{78,34,24}};
		for(int i =0; i<arr2.length;i++)
		{
			for(int j = 0; j<arr2[i].length;j++)
			System.out.println(arr2[i][j]);
		}
//		System.out.println(arr1.length);
//		System.out.println(arr2.length);
	}
	void demoArrays()
	{
			int [] ages = new int [3];
			ages[0]=5;
			ages[1]= 12;
			ages[2]=34;
			for(int i =0;i < ages.length;i++) 
			{
				System.out.println( ages[i]);
				
			}
				String [] names = {"kavya","radha","sakshi"};
				
				
			for(int i =0;i < names.length;i++)
			{
				System.out.println( names[i]);
				
			}
			
			System.out.println(" foreach output is  this : \n ");
			for(String name : names)
			{
				System.out.println(name);
			}
				
//				System.out.println(names.length);
//				System.out.println(ages.length);
	}
	public static void main(String[] args) 
	{
		ArrayExample obj = new ArrayExample();
		//obj.demoArrays();
		obj.multiarrays();
	}

}
