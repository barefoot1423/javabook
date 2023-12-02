package chapter11;

public class ComputerMain {

    public static void main(String[] args) {
        Computer computer = new Computer(3, 5, new int[] {2, 3, 5});

        Computer cloned = computer.getComputer();
        cloned.ram[0] = 10;

        System.out.println(computer);
        System.out.println(cloned);
    }

}
