package chapter10;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }

    private static void findClass() throws ClassNotFoundException {
        System.out.println("In the method findClass()");
        Class clazz = Class.forName("java.lang.String2");
    }

}
