package Basics;

import java.util.*;

public class AreaPin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Area  : ");
		String area = sc.next();
		sc.close();
		int op = switch (area)
				{
				case "Katraj", "Bharti", "Ambegao", "Singhad" -> {
					System.out.println("famous for chole Bature !");
					yield(411046);
				}
				
				case "JM Road","Deccan","FC Road" -> {System.out.println(" Famous for Fc");
				yield(411149);
				}
		default -> {
			System.out.println(" Invalid Area ! Please Enter the valid Area ");
			yield(0);
		}

		};
		System.out.println(" The PinCode of Area is : " + op);
	}

}
