package chapter7;

public class DmbCell extends CellPhone {

    int channel;

    public DmbCell(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("channel " + channel + " start");
    }

}
