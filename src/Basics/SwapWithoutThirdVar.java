package Basics;

class OtherLogic {

	public void swap(int a, int b) {
		System.out.println(" a : " + a + " b : " + b);
		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println(" a : " + a + " b : " + b);
	}

}

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println(" a : " + a + " b : " + b);

		a = a + b; // 30
		b = a - b; // 30-20 = 10
		a = a - b;

		System.out.println(" a : " + a + " b : " + b);

		System.out.println(" Another Logic : ");

		OtherLogic obj = new OtherLogic();
		obj.swap(20, 60);

	}

}
