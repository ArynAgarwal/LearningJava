package Unit_01;

import java.util.Scanner;

/*
 * when user takes input from the console!
 * 
 * nextLine()		Read user input [to read Strings]
 * next()			Read next token from the input entered by the user 
 * 
 *  nextBoolean()	Reads a boolean value from the user
 *  nextByte()		Reads a byte value from the user
 *  nextDouble()	Reads a double value from the user
 *  nextFloat()		Reads a float value from the user
 *  nextInt()		Reads a int value from the user 
 *  nextLine()		Reads a string value from the user
 *  nextLong()		Reads a long value from the user
 *  nextShort()		Reads a short value from the user
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);//Create a scanner obj
		Scanner obj2 = new Scanner(System.in);
		
		//Read the First-Token till the spacebar: (_spacebar)
		String Firstname = obj1.next();
		System.out.println("Name is" + Firstname );
		
		String name = obj2.nextLine();
		System.out.println("Name is : " + name);
		
		Boolean b = obj1.nextBoolean();
		System.out.println("Name is correct: " b );
		
		obj1.close();
		obj2.close();

	}

}
