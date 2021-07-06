package StaticsMethods;

public class LearnStatic {
	public String car = "Benz";
	public static String cars = "BMW";

	public void change() {
		LearnStatic obj = new LearnStatic();

		System.out.println("Engine Secret of the Car:"+car);
		System.out.println("Engine Secret of the Car"+cars);

	}

	public static void costlycars() {
		System.out.println("Costly cars are Benz and BMW");
	}

	public static void main(String[] args) {
		
		LearnStatic obj = new LearnStatic();
		
		obj.change();
		System.out.println(cars);

		costlycars();
	}
}
