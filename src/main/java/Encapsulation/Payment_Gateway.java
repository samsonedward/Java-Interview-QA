package Encapsulation;

public class Payment_Gateway {
	int enteredcvv = 13;
	int money=900000;
	int fixeddeposit=250000;

	public void verifyCVV() {
		MySecuredData data = new MySecuredData();
		if (data.getCVV() == enteredcvv) {
			System.out.println("The Valid CVV verified Successfully ");
		} else {
			System.out.println("CVV is not Verified!!Please check the CVV");
		}
	}

	public void depositAmount() {
		MySecuredData data = new MySecuredData();

		System.out.println("Balance Before Deposit: " + data.getBalance());
		data.setBalance(money);
		System.out.println("Balance After Deposit: " + data.getBalance());
		data.setBalance(money+fixeddeposit);
		System.out.println("Balance After Deposit: " + data.getBalance());
	}

	public static void main(String[] args) {

		Payment_Gateway p1 = new Payment_Gateway();
		p1.verifyCVV();
		new Payment_Gateway().verifyCVV();

		MySecuredData data = new MySecuredData();
		System.out.println("Display the current Balance " + data.getBalance());

		new Payment_Gateway().depositAmount();
	}

}
