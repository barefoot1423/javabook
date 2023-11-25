package chapter6;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonEx instance1 = SingletonEx.getInstance();
        SingletonEx instance2 = SingletonEx.getInstance();

        System.out.println(instance1.equals(instance2));

    }

}
