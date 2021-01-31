package JavaBasics;


 class Adi {
	
	void add(float a,int b) {
		System.out.println("sum of two no:" +(a+b));
	}
 }
 class Abi extends  Adi{
	void add(int a,float b) {
		System.out.println("sum of three no"+(a-b));
	}
}


public class DynamicPolymer {

	public static void main(String[] args) {
     Adi d=new Abi();
     d.add(3,2);
     
	}

}
