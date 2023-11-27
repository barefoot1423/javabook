package chapter7;

import org.w3c.dom.ls.LSOutput;

public class CellPhone {

    String model;
    String color;

    void powerOn() {
        System.out.println("Power on");
    }

    void powerOff() {
        System.out.println("Power off");
    }

    void bell() {
        System.out.println("ring bell");
    }

    void sendVoice(String msg) {
        System.out.println("send " + msg);
    }

    void receiveVoice(String msg) {
        System.out.println("receive " + msg);
    }

    void hangUp() {
        System.out.println("drop a call");
    }

}
