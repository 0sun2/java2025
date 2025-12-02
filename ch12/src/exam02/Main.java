package exam02;

public class Main {
    public static void main(String[] args) {
//        Runnable drawing = new Drawing();
//        Thread thread = new Thread(drawing);
//        thread.start();

        Thread thread = new Thread(
            new Runnable() {
                public void run() {
                    for(int i = 0; i < 5; i++) {
                        System.out.println("Drawing!!");;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {}
                    }
                }
            }
        );
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("Main!!");;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }

    }
}
