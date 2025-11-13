package exam2;

public class AnimalHospital {
	private Animal[] animals;
	private int count;
	
	public AnimalHospital(int maxCapacity) {
		animals = new Animal[maxCapacity];
		count = 0;
	}
	
	public void admitAnimal(Animal animal) {
		if (count < animals.length) {
			animals[count++] = animal;
			System.out.println(animal.getName() + "이(가) 입원했습니다");
		} else {
			System.out.println("병원이 가득 찼습니다");
		}
	}
	
	public void CheckPatient() {
		System.out.println("=== 환자 상태 확인 ===");
		for (int i = 0; i < count; i++) {
			Animal animal = animals[i];
			System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + 
					"): " + animal.getStatus() + " - HP: " + animal.getHitpoint());
		}
	}
	
	public void HealPatient() {
		System.out.println("=== 치료 시작 ===");
		for (int i = 0; i < count; i++) {
			Animal animal = animals[i];
			if (!animal.isHealthy()) {
				animal.setHitpoint(100);
				System.out.println(animal.getName() + "의 체력을 100으로 회복시켰습니다");
			}
		}
	}
	
	public void makeAllNoise() {
		System.out.println("=== 동물들의 소리 ===");
		for (int i = 0; i < count; i++) {
			System.out.print(animals[i].getName() + ": ");
			animals[i].sound();
		}
	}
}
