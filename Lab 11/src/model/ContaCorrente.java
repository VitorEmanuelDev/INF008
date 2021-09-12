package model;

public class ContaCorrente extends Conta{

	private final double TAXA = 1;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numeroDeConta, double taxa) {

		super(numeroDeConta);
		
	}

	@Override
	public void depositar(double montante) {

		if(montante > 0) {

			saldo += montante;

		}else {

			System.out.println("Não é possível depositar um valor negativo");
		}

	}

	@Override
	public void sacar(double montante) {

		if(montante > 0) {

			saldo += montante;
			
			if(montante <= saldo) {
				
				saldo -= montante;
				
			}

		}else {

			System.out.println("Não é possível sacar um valor negativo");
		}
	}




	@Override
	public void consultar(Integer numeroDeConta) {


	}
	
	public void aplicarTaxa(double montante) {
		
		
	}
	
	public void cobrarTaxa() {
		String data = java.time.LocalDate.now().toString();
		
		if(data.charAt(8) == '0' && data.charAt(9) == '1') {


		}

	}



}
