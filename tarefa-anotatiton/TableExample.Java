import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @interface Table
 * @brief Annotation that receives the table name
 */
@Retention(RetentionPolicy.RUNTIME) // Keeps the annotation at runtime
@interface Table {
    String value(); // The value of the annotation will be the table name
}

/**
 * @class User
 * @brief Example class that uses the @Table annotation
 */
@Table("users") // Here we define the table name
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

/**
 * @class Main
 * @brief Main program demonstrating the use of @Table annotation
 */
public class TableExample {
    public static void main(String[] args) {
        // Get the annotation from the User class
        Table table = User.class.getAnnotation(Table.class);

        if (table != null) {
            System.out.println("Table associated with User class: " + table.value());
        } else {
            System.out.println("No table associated with User class.");
        }
    }
}
