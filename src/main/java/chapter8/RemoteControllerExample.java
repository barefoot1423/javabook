package chapter8;

public class RemoteControllerExample {

    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc.setMute(true);
        rc.setVolume(5);
        RemoteControl.chargeBattery();
    }
}
