package chapter11;

public class Car {
    public String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
            "model='" + model + '\'' +
            '}';
    }

}
