package JavaBasics;


class Person{
	private String name;
    private int age;

    public void setName(String name) {
    	this.name=name;
    }
    
    public void setAge(int age) {
    	this.age=age;
    }
     public String name() {
    	 return name;
     }
     public int age() {
    	 return age;
     } 

}

public class InatanceMethod {
	
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("raju");
		p1.setAge(12);
		System.out.println("name is :"+p1.name());
		System.out.println("age is "+p1.age());
	}

}
