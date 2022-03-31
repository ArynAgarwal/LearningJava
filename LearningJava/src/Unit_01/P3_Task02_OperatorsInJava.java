package Unit_01;

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		
		P3_Task02_OperatorsInJava obj = new P3_Task02_OperatorsInJava();
		obj.UnaryOperator();
	}
	
	void UnaryOperator() {
		int a = 10;
		boolean b = false;
		System.out.println("Inside Unary Operator");
		System.out.println(a++);//10
		System.out.println(a--);//11
		System.out.println(++a);//11
		System.out.println(--a);//10
		System.out.println("----------------------");
	}
	
	void ArithematicOperator() {
		
	}
}
