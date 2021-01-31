package JavaBasics;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;


public class ArrayListDemo {
	
    public static int i;
	
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//	
//		
//		System.out.println("how many input you are giving:" );
//		
//		String ab=scan.nextLine();
		LinkedList<String> ar=new LinkedList<String>();
		//System.out.println("size of LinkedList:" +ar.size());
		Scanner scan=new Scanner(System.in);
	    int ab=scan.nextInt();
		
	    for (int i = 0; i < ab; i++) {
            int ab = scan.nextInt();
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            ar.add(scan);

            
        }

		Collections.sort(ar);
		ListIterator<String> it = ar.listIterator();
		System.out.println("content all list:"+ar);
		
//		while(it.hasNext()){
//			System.out.println(it.next());			
//		}
		
		while(it.hasPrevious()){
			System.out.println(it.previous());			
		}
		ar.set(1, "70");
		System.out.println("update"+ar);
		//ar.lastIndexOf("a");
//		System.out.println("size of LinkedList after add:"+ar.size());
//		System.out.println("content all list:"+ar);
//		ar.remove("c");
//		ar.ensureCapacity(10);
//		System.out.println("after content all list:"+ar.size());
        
		
		
	}

}
