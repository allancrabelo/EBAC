/**
 * @file PessoaJuridica.java
 * @brief Concrete class representing a legal entity (company).
 */
public class PessoaJuridica extends Person {

	private String cnpj;

	public PessoaJuridica(String name, String address, String cnpj) {
		super(name, address);
		this.cnpj = cnpj;
	}

	public void printInfo() {
		System.out.println("\n=== Pessoa Juridica ===");
		super.printInfo();
		System.out.println("CNPJ: " + cnpj);
	}
}
