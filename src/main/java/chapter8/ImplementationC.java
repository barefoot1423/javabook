package chapter8;

public class ImplementationC implements InterfaceC{


    @Override
    public void methodA() {
        System.out.println("methodA");
    }

    @Override
    public void common() {
        System.out.println("common");
    }

    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void methodC() {
        System.out.println("methodC");
    }

}
