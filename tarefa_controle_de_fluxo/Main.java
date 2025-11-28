import java.util.Scanner;

/**
 * @brief That it's a simple function to calculate a grade avarege in simple way
 * 
 * @details
 * 1) Main method work like a engine to make the program works properly
 * 2) scanGrade create a input layer to bring the inputs to variables
 * 3) avarageCalculator take the input and calculate de avarage
 * 4) Had a method to show the result, calculate if user are approved, in recuperation
 * or repproved
 */
public class Main {
	
	public static void main(String[] args) {
		double[] grades = scanGrade();
		double average = averageCalculator(grades);
		gradeShower(average);
	}

	public static double[] scanGrade() {
		Scanner scanner = new Scanner(System.in);
		double[] grade = new double[4];

	for (int i = 0; i < 4; i++){
		System.out.print("Enter your grade " + (i + 1) + ": ");
		String input = scanner.nextLine();
		if (input.matches("\\d+(\\.\\d+)?")) {
			grade[i] = Double.parseDouble(input);
		} else {
			System.out.println("Input Error");
			System.exit(1);
		}
	}
		return (grade);
	}

	public static double averageCalculator(double[] grades) {
		double sum = 0;

		for (double n : grades) {
			sum += n;
		}
		return (sum / grades.length);
	}

	public static void gradeShower (double average){
		System.out.println("Your grade Average: " + average);
		if (average >= 7) {
			System.out.println("Approved");
		} else if (average < 7 && average >= 5) {
			System.out.println("Recuperation");
		} else {
			System.out.println("Repproved");
		}
	}
}