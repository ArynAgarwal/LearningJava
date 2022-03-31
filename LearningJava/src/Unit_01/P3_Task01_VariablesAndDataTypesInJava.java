package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {
	
	static int a = 11;
	int b = 10;
	public static void main(String[] args) {
		
		// Valid Declaration
		int x,y,z;
		float pi;
		double d;
		char c;
		
		int a = 5; // Local variable
		
		System.out.println("Local a = "+ a);
		System.out.println("Global a = "+ P3_Task01_VariablesAndDataTypesInJava.a);
		System.out.println();
		P3_Task01_VariablesAndDataTypesInJava obj = new P3_Task01_VariablesAndDataTypesInJava();
		obj.typeCoversionAndtypeCasting();
		
	}
	
	void typeCoversionAndtypeCasting() {
		
		System.out.println("Type Conversion And Type Casting");
		
		double f;
		int i = 10;
		f = i;
		System.out.println("Value of double f = "+f);
		
		double g = 45.65;
		int j;
		j = (int)g;
		
		System.out.println("Value of int i = "+i);
		System.out.println("Value of int j = "+j);
	}

}
