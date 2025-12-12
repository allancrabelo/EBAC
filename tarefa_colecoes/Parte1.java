/**
 * @file Parte1.java
 * @brief Program that receives multiple names separated by commas,
 *        parses them, sorts them in ASCII order, and prints the result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Parte1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter names separated by commas: ");
		String input = sc.nextLine();
		sc.close();
		String[] names = Arrays.stream(input.split(","))
							   .map(String::trim)
							   .filter(s -> !s.isEmpty())
							   .toArray(String[]::new);
		Arrays.sort(names);
		System.out.println("\nNames in ASCII order:");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
