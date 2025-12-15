import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender.toUpperCase();
    }

    public String getName() { return name; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return name + "-" + gender;
    }
}

public class FilterWomen {

    public static List<Person> filterWomen(List<Person> people) {
        return people.stream()
                     .filter(p -> p.getGender().equals("F"))
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.println("Enter people in format Name-Gender (e.g., Joao-M) and a NEW LINE. Type 'end' to finish:");

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("end")) break;

            String[] parts = line.split("-");
            if (parts.length != 2) {
                System.out.println("Invalid format. Try again.");
                continue;
            }

            String name = parts[0];
            String gender = parts[1];

            people.add(new Person(name, gender));
        }

        List<Person> women = filterWomen(people);

        System.out.println("\nList of women:");
        women.forEach(System.out::println);

        scanner.close();
    }
}
