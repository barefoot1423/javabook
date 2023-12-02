package chapter11;

import java.util.Arrays;

public class StringSplitExample {

    public static void main(String[] args) {
        String text = "ABC&DEF,GHI,JKL-MNO";

        String[] a = text.split("&|,|-");
        System.out.println(Arrays.toString(a));
    }

}
