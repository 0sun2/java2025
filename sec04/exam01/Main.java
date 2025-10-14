package sec04.exam01;

public class Main {
	public static void main(String[] args) {

		Car car1 = new Car(50, 20, "Kia", "파랑");
		Car car2 = new Car(30, 15, "현대", "빨강");

		car1.showGas();
		car2.fillGas(10);


		Car.showNumberOfCars();
	}
}
