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
		System.out.println("---------------------");
	}
	
	void ArithematicOperator() {
		System.out.println("Inside Arithematic Opertor");
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("Solve the following exp: 10 * 10 / 5 + 3 - 1 * 4 / 2");
		System.out.println("Answer: ");
		System.out.print(10 * 10 / 5 + 3 - 1 * 4 / 2);
		System.out.println("-----------------------");
	}
	
	void ShiftOperator() {
		
	}
}
