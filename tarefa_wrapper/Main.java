/**
 * @brief That it's a simple function to casting primitive data to
 * wrapper
 * 
 * @details
 * Declare primitive types, casting to wrapper and print new data
 */
public class Main {
	public static void main(String[] args) {

		int numInt = 42;
		float numFloat = 3.14f;
		double numDouble = 5.55;
		short numShort = 10;
		byte numByte = 2;
		boolean flag = true;
		char letter = 'A';

		Integer wInt = numInt;			// int -> Integer
		Float wFloat = numFloat;		// float -> Float
		Double wDouble = numDouble;		// double -> Double
		Short wShort = numShort;		// short -> Short
		Byte wByte = numByte;			// byte -> Byte
		Boolean wBoolean = flag;		// boolean -> Boolean
		Character wChar = letter;		// char -> Character

		System.out.println("Integer: " + wInt);
		System.out.println("Float: " + wFloat);
		System.out.println("Double: " + wDouble);
		System.out.println("Short: " + wShort);
		System.out.println("Byte: " + wByte);
		System.out.println("Boolean: " + wBoolean);
		System.out.println("Character: " + wChar);
	}
}
