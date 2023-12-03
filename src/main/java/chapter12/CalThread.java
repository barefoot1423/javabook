package chapter12;

public class CalThread extends Thread {

    public CalThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (long i = 0; i < 20000000000l; i++) {

        }
        System.out.println(getName());
    }

}
