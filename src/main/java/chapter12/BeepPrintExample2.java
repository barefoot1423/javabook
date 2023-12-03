package chapter12;

public class BeepPrintExample2 {

    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread th = new Thread(beepTask);
        th.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Thing");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

        }
    }

}
