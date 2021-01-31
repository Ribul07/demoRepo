package JavaBasics;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your string");
		String s=scan.nextLine();
		StringBuffer sb=new StringBuffer(s);
		String b=sb.reverse().toString();
		if(s.equals(b)) {
			System.out.println("palindrom");
			
		}
		else
		{
			System.out.println("not palindrom");
		}

	}

}
