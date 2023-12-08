package chapter16;

import java.util.Arrays;
import java.util.List;

public class reduce {

    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
          new Member("Sin", 1, 33),
          new Member("Jo", 0, 57),
          new Member("Kim", 1, 21)
        );

        Integer i = memberList.stream().map(Member::getAge).reduce((a, b) -> a + b).get();
        System.out.println(i);

        int i1 = memberList.stream().map(Member::getAge).reduce(200, (a, b) -> a + b).intValue();
        System.out.println(i1);

    }

}
