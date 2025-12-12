/**
 * @file PessoaFisica.java
 * @brief Concrete class representing a physical person (individual).
 */
public class PessoaFisica extends Person {

	private String cpf;

	public PessoaFisica(String name, String address, String cpf) {
		super(name, address);
		this.cpf = cpf;
	}

	@Override
	public void printInfo() {
		System.out.println("\n=== Pessoa Fisica ===");
		super.printInfo();
		System.out.println("CPF: " + cpf);
	}
}
