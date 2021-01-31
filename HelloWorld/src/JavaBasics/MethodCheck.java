package JavaBasics;

import java.util.Scanner;

public class  MethodCheck {
	

	
	public void checkPrime() {
		int i,count=0;
		int num;
		
		Scanner nu=new Scanner(System.in);
		System.out.println("enter the no");
		 num=nu.nextInt();
		if(num<=1) {
			System.out.println("not prime ");
		}
		
	

	for(i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("entered number is prime no"); 
	}
	else {
		System.out.println("not prime");
	}
		
	}
		
		
	

	public static void main(String[] args) {
		MethodCheck pr=new MethodCheck();
		
		
		pr.checkPrime();

	}
	
	

}
