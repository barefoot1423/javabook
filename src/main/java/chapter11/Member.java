package chapter11;

import java.util.Arrays;

public class Member implements Cloneable {

    public String name;
    public String age;
    public int[] scores;
    public Car car;

    public Member(String name, String age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.fillInStackTrace());
        }
        return cloned;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Member cloned = (Member) super.clone();

        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        cloned.car = new Car(this.car.model);

        return cloned;
    }

    @Override
    public String toString() {
        return "Member{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            ", scores=" + Arrays.toString(scores) +
            ", car=" + car +
            '}';
    }

}
