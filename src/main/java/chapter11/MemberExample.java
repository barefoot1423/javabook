package chapter11;

public class MemberExample {

    public static void main(String[] args) {
        Member original = new Member("Hong", "25", new int[] {90, 90}, new Car("Civic"));

        Member cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "4runner";

        System.out.println(original);
        System.out.println(cloned);

    }

}
