package exam04;

public class ThreadA extends Thread {
    public ThreadA() {
        setName("Drawing Thread");
    }
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("ThreadA!!");;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

}
