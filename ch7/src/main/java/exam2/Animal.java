package exam2;

public abstract class Animal {
	public String kind;
	private int hitpoint;
	
	public Animal(int hitpoint) {
		this.hitpoint = hitpoint;
	}
	
	public Animal() {
		this.hitpoint = 100;
	}
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	
	public boolean isHealthy() {
		return hitpoint >= 50;
	}
	
	public void setHitpoint(int hitpoint) {
		this.hitpoint = hitpoint;
	}
	
	public int getHitpoint() {
		return hitpoint;
	}
	
	public String getStatus() {
		return isHealthy() ? "Healthy" : "Sick";
	}
	
	public String getName() {
		return kind;
	}
}
