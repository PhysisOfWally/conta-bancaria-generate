package conta;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		//iniciando o projeto conta bancária
		Conta c1 = new Conta(15445, 987456, 1, "vazio", 0.0f);
		c1.visualiza();
		
		c1.setTitular("Carlos");
		c1.setSaldo(2000.0f);
		c1.visualiza();
	}
}
