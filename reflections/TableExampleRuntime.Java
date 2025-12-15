import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String value();
}

@Table("users")
class User {
    private String name;
    private int age;
}

@Table("products")
class Product {
    private String name;
    private double price;
}

public class TableExampleRuntime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Map for Java 8
        Map<String, Class<?>> classes = new HashMap<>();
        classes.put("user", User.class);
        classes.put("product", Product.class);

        System.out.println("Enter class name (user or product):");
        String input = scanner.nextLine().trim().toLowerCase();

        Class<?> clazz = classes.get(input);

        if (clazz == null) {
            System.out.println("Class not found: " + input);
            scanner.close();
            return;
        }

        Table table = clazz.getAnnotation(Table.class);

        if (table != null) {
            System.out.println("Table associated with " + clazz.getSimpleName() + ": " + table.value());
        } else {
            System.out.println("No table associated with class " + clazz.getSimpleName());
        }

        scanner.close();
    }
}
