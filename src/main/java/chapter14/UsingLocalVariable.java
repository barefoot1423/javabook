package chapter14;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 40;



        MyFunctionalInterface1 fi = () -> {
            System.out.println("arg " + arg);
            System.out.println("localVar " + localVar + "\n");
        };
        fi.method();
    }

}
