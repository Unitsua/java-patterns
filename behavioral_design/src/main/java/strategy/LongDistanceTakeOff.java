package strategy;

public class LongDistanceTakeOff implements TakeOffBehavior {
    public void takeoff () {
        System.out.println ("长距离起飞...");
    }
}
