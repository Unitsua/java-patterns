package strategy;

public abstract class Airaft {
    protected TakeOffBehavior takeOffBehavior;
    protected FlyBehavior flyBehavior ;

    public void takeoff () {
        takeOffBehavior.takeoff ();
    }

    public void fly () {
        flyBehavior.fly ();
    }
}
class Helicopter extends Airaft {

    public Helicopter(){
        System.out.println ("**直升机** ");
        takeOffBehavior = new VerticalTakeOff ();

        flyBehavior = new SubSonicFly ();

    }
}

class AirPlane extends Airaft {

    public AirPlane(){
        System.out.println ("**客机** ");
        takeOffBehavior = new LongDistanceTakeOff ();
        flyBehavior = new SubSonicFly ();
    }
}

class Fighter extends Airaft {

    public Fighter(){
        System.out.println ("**歼击机** ");
        takeOffBehavior = new LongDistanceTakeOff ();
        flyBehavior = new SuperSonicFly ();

    }
}


class Harrier extends Airaft {

    public Harrier(){
        System.out.println ("**鹞式战斗机**");
        takeOffBehavior = new VerticalTakeOff ();
        flyBehavior = new SuperSonicFly ();
    }
}