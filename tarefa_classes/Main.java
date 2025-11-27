public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person.introduce());

        person.setName("Michael");
        person.setAge(30);


        System.out.println(person.introduce());
    }
}
