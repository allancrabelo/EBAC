/**
 * @file Person.java
 * @brief Abstract base class representing a generic person.
 */

public abstract class Person {

	protected String name;
	protected String address;


	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}
}
