package exam03;

public class Main {

    public static void main(String[] args) {
        Button btn = new Button();
        Button.OnClickListener callListener =
         new Button.OnClickListener() {
            public void onClick() {
                System.out.println("Make a call!!");
            }

         };
         btn.SetOnClickListener(callListener);
         btn.Touch();

         btn.SetOnClickListener(
            new Button.OnClickListener() {
                public void onClick() {
                    System.out.println("Send a message!!");
                }
            }
         );
         btn.Touch();
    }
}
