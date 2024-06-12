package conta.model;

public class Conta {
	//declarando os atributos
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
			this.numero = numero;
			this.agencia = agencia;
			this.tipo = tipo;
			this.titular = titular;
			this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void visualiza() {
		System.out.print("\n**********************************\n");
		System.out.print("Titular: " + this.titular);
		System.out.print("\nÃgencia: " + this.agencia);
		System.out.print("\nNumero: " + this.numero);
		System.out.print("\nTipo: " + this.tipo);
		System.out.print("\nSaldo: " + this.saldo);
		System.out.println("\n**********************************");
	}
}
