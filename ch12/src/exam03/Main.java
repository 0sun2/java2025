package exam03;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new Drawing();
        Thread thread = new Thread() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("Drawing!!");;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        };
    thread.start();

    for(int i = 0; i < 5; i++) {
        System.out.println("Main!!");;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
}
