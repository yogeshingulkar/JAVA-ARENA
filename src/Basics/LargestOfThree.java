package Basics;

public class LargestOfThree {

	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 30;
		int n3 = 89;
		
		System.out.println(" Basic Approach : ");
		
		int largest = n1 > n2 ? (n1 > n3 ? n1 : n3): (n2 > n3 ? n2 : n3);
		
		System.out.println(n1 + "," + n2 + ","+ n3 + " Largest is : " + largest);
		
		System.out.println(" Second Approach : "+ secondApproach(90,678,8));
		System.out.println(" Optimize way : "+optimize(5890,987,987876));
	}
	
	public static int  secondApproach(int n1,int n2,int n3)
	{
		return (n1 > n2 ? n1 : n2)  > n3 ? (n1 > n2  ? n1 : n2) : n3;
	}
	
	public static int optimize(int n1,int n2,int n3)
	{
		int large = 0;
		int largest = (large = (n1 > n2) ? n1 : n2) > n3 ? large : n3;
		
		return largest;
	}

}
