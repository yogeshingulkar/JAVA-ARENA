package Arrays;

import java.util.*;

public class SecondMinimumElement {

	public static int findMin(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static int findSecondMinimum(int arr[]) {
		int min = findMin(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				arr[i] = Integer.MAX_VALUE;
			}
		}
		int secondMin = findMin(arr);

		return secondMin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println(" Enter the Element in the array : ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		System.out.println(" Min element in the array : " + findMin(arr));
		
		System.out.println(" Second Minimum Element in the Array : " + findSecondMinimum(arr));

	}

}
