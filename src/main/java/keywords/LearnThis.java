package keywords;

public class LearnThis {
	int a = 5;
	 	LearnThis() {
		this("sam");
		System.out.println("First Constructor");
	}

	LearnThis(String str) {
		this(5);
		System.out.println("Hello " + str);
	}

	LearnThis(int a) {
		System.out.println("This is the third constructor: " + a);
	}

	public void print(String name) {
		System.out.println("Hello " + name);
	}

	public void printdata() {
		int var = this.a;
		System.out.println(this.a);
		this.print("Balaji");
	}

	public static void main(String[] args) {
		LearnThis obj = new LearnThis();
		System.out.println(obj.a);

		obj.print("sam");
		System.out.println("*********************");
		obj.printdata();

	}
}
