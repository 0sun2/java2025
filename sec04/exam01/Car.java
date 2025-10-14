package sec04.exam01;

public class Car {

	int gas;
	static int numberOfCars;

	int minGas;
	String teamName;
	String color;

	Car(int gas, int minGas, String teamName, String color) {
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
		
		
		numberOfCars++;
	}


	void fillGas(int amount) {
		gas += amount;
		System.out.println(amount + "주유");
		System.out.println("현재 연료: " + gas);
	}

	void showGas() {
		System.out.println("현재 연료: " + gas + "필요 연료: " + minGas);
	}

	static void showNumberOfCars() {
		System.out.println("자동차 수: " + numberOfCars);
	}
}