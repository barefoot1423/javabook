package chapter8;

public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("On mute");
        } else {
            System.out.println("Not on mute");
        }
    }

    static void chargeBattery() {
        System.out.println("replace a battery");
    }

}
