package chapter9;

public class Amain {

    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();

        System.out.println(b.field1);
        b.method();
    }

}
