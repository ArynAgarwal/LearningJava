package Unit_01;

/*
 * It is called when an instance of the class is created
 * At the time of calling the constructor, memory for the object is allocated in the memory
 * It is a special type of method which is used to initialize the object
 * Every time an object is created using the new() keyword, at least one constructor is called
 * Two types of Constructor in Java
 *   1.Parameterized Constructor
 *   2.Default Constructor
 */

public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		
		ABC4 obj1 = new ABC4();
		
		ABC4 obj2 = new ABC4();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		

	}

}

class ABC4{
	
	int a;
	
	/*
	 * Classname(Constructor Parameters){
	 * 	all the class and Instance variables can be initialized here!
	 * }
	 * 
	 */
	
	ABC4(){
		a = 10;
	}
	
	ABC4(int a){
		this.a = a;
	}
	
	void display() {
		int b = 10;
		
		System.out.println(a);
		System.out.println(b);
			
	}
	
	int display2() {
		
		System.out.println(a);
		
		//System.out.println(b);ERROR: b cannot be resolved to a variable
		return a;
	}
}
