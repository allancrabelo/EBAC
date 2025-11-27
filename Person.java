/**
 * The Person class represents a person with a name and an age.
 * It contains methods to access and modify these values,
 * as well as a method to introduce the person.
 */
public class Person {

    // -------------------------
    // Properties (Fields)
    // -------------------------

    /** The person's name */
    private String name;

    /** The person's age */
    private int age;

    // -------------------------
    // Constructor
    // -------------------------

    /**
     * Creates a new Person object.
     *
     * @param name The person's name.
     * @param age  The person's age.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // -------------------------
    // Getters (Access Methods)
    // -------------------------

    /** Returns the person's name. */
    public String getName() {
        return name;
    }

    /** Returns the person's age. */
    public int getAge() {
        return age;
    }

    // -------------------------
    // Setters (Modify Methods)
    // -------------------------

    /** Changes the person's name. */
    public void setName(String name) {
        this.name = name;
    }

    /** Changes the person's age. */
    public void setAge(int age) {
        this.age = age;
    }

    // -------------------------
    // Other Methods
    // -------------------------

    /**
     * Makes the person introduce themselves.
     * @return A sentence with the person's name and age.
     */
    public String introduce() {
        return "Hello! My name is " + name + " and I am " + age + " years old.";
    }
}
