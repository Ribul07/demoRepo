package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class CountCoin {
	
	

	public static void main(String[] args) {
		
		
		
		
		int man=10;
		int coin=10;
		int i=1;
		String ab="head";
		String cd="tail";
		
		
		ArrayList<String> al=new ArrayList<String>(10);
//		ArrayList<String> al1=new ArrayList<String>();
	 
		
		for(man=1;man<=coin;man++) {
			
			al.add(ab);
			
			
		}
//		System.out.print(al);
//	
//		System.out.println(" ");
//		System.out.println(al.get(9));
		for(man=1;man<=coin;man++) {
			if(man%2==0) {
				
				al.add(cd);
				
				
			}
			else {
			   al.add(ab);
			}
		}
//		System.out.println(" ");
//		System.out.println(al);
//		
		
	  
		for(man=1;man<=10;man++) {
			if(man%3==0) {
				System.out.println(al.get());
				al.add(cd);
				
				
			}
			else {
			   al.add(ab);
			}
			System.out.println(al);
		}
  
//	  int c=0;
//		for (String data :al)
//		{
//			if(data=="tail")
//				c++;
//		}
//		System.out.println(c);
//		
	}

}
