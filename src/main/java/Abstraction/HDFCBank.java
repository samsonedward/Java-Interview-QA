package Abstraction;

public class HDFCBank extends Bankaccount {

	@Override
	public void credit_card() {
		System.out.println("HDFC will not Provide Credit Card");

	}

	@Override
	public void Debit_card() {
		System.out.println("HDFC will Provide Debit Card");

	}
	
	@Override
	public void Mobilebanking() {
		System.out.println("HDFC will Provide Mobile Banking");

	}
	public static void main(String[] args) {
		Bankaccount Bankaccount = new HDFCBank();
		Bankaccount.credit_card();
		Bankaccount.Debit_card();
		Bankaccount.Netbanking();

	}

	@Override
	public void Netbanking() {
		System.out.println("HDFC will Provide Netbanking");

	}
	

}
