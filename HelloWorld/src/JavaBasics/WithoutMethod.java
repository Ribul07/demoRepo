package JavaBasics;

import java.util.Scanner;

public class WithoutMethod {
	
	

	public static void main(String[] args) {
		String a;
		String b="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur string");
		a=sc.next();
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
	}
		System.out.println(b);
			if(b.equals(a)) {
				System.out.println("palindrom");
			}
			else {
				System.out.println("not palindrom");
			}
			
			
		}

	}


