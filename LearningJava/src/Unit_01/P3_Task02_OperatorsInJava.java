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
		
		System.out.println("Inside Shift Operator");
		
//		01010101<<1
//		10101010
//		
//		01010101>>1
//		00101010
		
		System.out.println(10 << 2);//10*2^2=10*4=40
		System.out.println(10 << 3);//10*2^3=10*8=80
		System.out.println(20 << 2);//20*2^2=20*4=80
		System.out.println(15 << 4);//15*2^4=15*16=240
		
		System.out.println(10 >> 2);//10/2^2=10/4=2
		System.out.println(20 >> 2);
		System.out.println(20 >> 3);
		
		System.out.println("-----------------------");
	}
	
	void RelationalOperators()
	 {
		System.out.println("Relational Operators - ");
		int a=3,b=3,c=5;
		System.out.println("a==b = " + (a==b));
		System.out.println("a!=b = " + (a!=b));
		System.out.println("a>c = " + (a>c));
		System.out.println("a<=c = " + (a<=c));
		System.out.println("-----------------------");
	}
	 
	 
	 void BitWiseOperatorsAndLogical()
	 {
		int a=5,b=10,c=20;
		System.out.println("Bitwise and Logical Operators - ");
		System.out.println(a<b && b++<c);
		System.out.println(a++>b || b>c);
		System.out.println(b);
		System.out.println(a);
		System.out.println(a>b | a<c);
		System.out.println(a<b & a++<c);
		System.out.println(a);
		System.out.println("-----------------------");
	 }

}
