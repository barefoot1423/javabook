package chapter8;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("turn on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off TV");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("Current volume : " + volume);
    }

}
