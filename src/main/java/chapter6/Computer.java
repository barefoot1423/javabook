package chapter6;

public class Computer {

    int sum1(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("The result of the summation is " + sum);
        return sum;
    }

    int sum2(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("The result of the summation is " + sum);

        return sum;
    }

}
