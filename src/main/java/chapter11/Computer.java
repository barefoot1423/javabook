package chapter11;

import java.util.Arrays;

public class Computer implements Cloneable {

    public int monitor;
    public int size;
    public int[] ram;

    public Computer(int monitor, int size, int[] ram) {
        this.monitor = monitor;
        this.size = size;
        this.ram = ram;
    }

    public int[] getRam() {
        return ram;
    }

    public void setRam(int[] ram) {
        this.ram = ram;
    }

    public Computer getComputer() {
        Computer cloned = null;

        try {
            cloned = (Computer) clone();
        } catch (CloneNotSupportedException e) {

        }
        return cloned;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "monitor=" + monitor +
            ", size=" + size +
            ", ram=" + Arrays.toString(ram) +
            '}';
    }

}
