package exam05;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        User user1 = new User("User1");
        user1.setCalculator(cal, 100);
        user1.start();

        User user2 = new User("User2");
        user2.setCalculator(cal, 50);
        user2.start();

    }
}
