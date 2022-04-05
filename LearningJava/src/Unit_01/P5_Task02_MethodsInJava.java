package Unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		ABC3 obj = new ABC3();
		
		//calling display method definition
		obj.display();
		System.out.println(obj.a);
	}

}

class ABC3{
	
	static int a = 10;
	
	/*Actual method definition
	 * 
	 *  datatype methodName(datatype2 p1, datatype2 p2){
	 *  
	 *  method body;
	 *  
	 *  return value //if required
	 *  
	 *  }
	 *  
	 */
	
	static void display() {
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
		
	}
	
	int display2() {
		
		System.out.println(a);
		
		return a;
		
	}
}