package base;

public class ZhichuandiTest {
     public static void main(String [] args){
    	 
//    	 int[] a = {1, 2};
//    	 int[] b = a;
//    	 b[1] = 5;
//    	System.out.println(a[1]);
    	Person person = new Person("Jack");
	    foo(person);
	    System.out.println(person.getName());
	     
	 
     }  	 
    static  void      foo(Person person) {
	person = new Person("Rose");

	}
}

 class Person {
	private final String name;

	public Person(String name) {
	this.name = name;
	}

	public String getName() {
	return name;
	}
	

	
 }
	
