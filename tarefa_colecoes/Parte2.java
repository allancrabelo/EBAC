/**
 * @file Parte2.java
 * @brief Program that receives commands in the format "name-M" or "name-F",
 *        separated by commas, and prints the names sorted in ASCII order
 *        separated by gender.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter commands (name-M or name-F), separated by commas: ");
		String input = sc.nextLine();
		sc.close();
		String[] commands = Arrays.stream(input.split(","))
								  .map(String::trim)
								  .filter(s -> !s.isEmpty())
								  .toArray(String[]::new);
		List<String> maleGroup = new ArrayList<>();
		List<String> femaleGroup = new ArrayList<>();
		for (String cmd : commands) {
			if (!cmd.contains("-") || cmd.length() < 3) {
				System.out.println("Invalid format skipped: " + cmd);
				continue;
			}
			String[] parts = cmd.split("-");
			if (parts.length != 2) {
				System.out.println("Invalid format skipped: " + cmd);
				continue;
			}
			String name = parts[0].trim();
			String genderStr = parts[1].trim();
			if (name.isEmpty() || genderStr.isEmpty()) {
				System.out.println("Invalid format skipped: " + cmd);
				continue;
			}
			char gender = Character.toUpperCase(genderStr.charAt(0));
			if (gender == 'M') {
				maleGroup.add(name);
			} else if (gender == 'F') {
				femaleGroup.add(name);
			} else {
				System.out.println("Invalid gender skipped: " + cmd);
			}
		}
		maleGroup.sort(String::compareTo);
		femaleGroup.sort(String::compareTo);
		System.out.println("\n--- Female Group (ASCII Order) ---");
		for (String n : femaleGroup) {
			System.out.println(n);
		}
		System.out.println("\n--- Male Group (ASCII Order) ---");
		for (String n : maleGroup) {
			System.out.println(n);
		}
	}
}
