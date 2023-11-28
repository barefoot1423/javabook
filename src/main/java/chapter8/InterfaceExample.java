package chapter8;

public class InterfaceExample {

    public static void main(String[] args) {
        ImplementationC imp = new ImplementationC();

        InterfaceA a = imp;
        a.methodA();
        a.common();

        InterfaceB b = imp;
        b.methodB();

        InterfaceC c = imp;
        c.methodA();
        c.methodB();
        c.methodC();
        c.common();

    }

}
