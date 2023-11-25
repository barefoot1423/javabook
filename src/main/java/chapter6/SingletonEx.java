package chapter6;

public class SingletonEx {
    private static SingletonEx  singletonEx = new SingletonEx();

    private SingletonEx() {

    }

    static SingletonEx getInstance() {
        return singletonEx;
    }


}
