/**
 * @file Main.java
 * @brief Test program to demonstrate the Person hierarchy.
 */

public class Main {
	public static void main(String[] args) {

		Person p1 = new PessoaFisica("Allan", "Rua Alpha, 123", "123.456.789-00");
		Person p2 = new PessoaJuridica("Rabelo Tech", "Avenida Central, 456", "12.345.678/0001-99");

		p1.printInfo();
		p2.printInfo();
	}
}
