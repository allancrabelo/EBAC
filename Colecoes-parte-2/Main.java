/**
 * @file Main.java
 * @brief A simple program that collects user names and genders, groups them,
 *        and prints the results.
 *
 * The program asks the user to type a name and a gender ("M" or "F").
 * The input is validated and stored inside the corresponding list.
 * When the user types "exit" as the name, the program finishes and prints
 * the male and female groups.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> maleGroup = new ArrayList<>();
		List<String> femaleGroup = new ArrayList<>();

		while (true) {
			System.out.print("Enter name (or type 'exit' to finish): ");
			String name = sc.nextLine().trim();

			if (name.equalsIgnoreCase("exit")) {
				break;
			}
			if (name.isEmpty()) {
				System.out.println("Name cannot be empty.");
				continue;
			}
			System.out.print("Enter gender (M/F): ");
			String genderInput = sc.nextLine().trim();
			if (genderInput.isEmpty()) {
				System.out.println("Gender cannot be empty.");
				continue;
			}
			char gender = Character.toUpperCase(genderInput.charAt(0));
			if (gender == 'M') {
				maleGroup.add(name);
			} else if (gender == 'F') {
				femaleGroup.add(name);
			} else {
				System.out.println("Invalid gender. Please enter M or F.");
			}
		}
		sc.close();
		System.out.println("\n--- Female Group ---");
		for (String n : femaleGroup) {
			System.out.println(n);
		}
		System.out.println("\n--- Male Group ---");
		for (String n : maleGroup) {
			System.out.println(n);
		}
	}
}
