package chapter9;

public class Amain {

    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();

        System.out.println(b.field1);
        b.method();


        A.C c = new A.C();
        c.method1();
        System.out.println(c.field2);;
    }

}
