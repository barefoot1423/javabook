package chapter12;

public class PriorityExample {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            Thread thread = new CalThread("thread" + i);
            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }

}
