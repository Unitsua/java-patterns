package strategy;

public class VerticalTakeOff implements TakeOffBehavior {
    public void takeoff () {
        System.out.println ("垂直起飞...");
    }
}
