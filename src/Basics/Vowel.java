package Basics;
import java.util.*;

public class Vowel
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Character  : ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
		{
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'I':
			case 'i':
			case 'o':
			case 'O':
			case 'U':
			case 'u':
			{
				System.out.println(ch + " is Vowel ");
				break;
			}
			
			default : 
			{
				System.out.println(ch + " is consonant ");
				break;
			}
			
			
			}
		}
		else {
			System.out.println(ch + " is not a Character ");
		}
	}

}
