package Encapsulation;

public class MySecuredData {
	private final short validcvv = 123;
	private int balance = 1000;

	//Get Method used to access the private variable outside of the class; Its return the private variable name in getmethod();
	
	public short getCVV() {
		return validcvv;
	}

	public void setBalance(int money) {
		balance = money;
	}

	public int getBalance() {
		return balance;
	}
}
