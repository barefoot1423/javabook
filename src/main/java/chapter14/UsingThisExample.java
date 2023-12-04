package chapter14;

public class UsingThisExample {

    public static void main(String[] args) {

//        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = new UsingThis().new Inner();
        inner.method();
    }

}
