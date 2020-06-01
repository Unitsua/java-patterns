package strategy;

public class Client {
    public static void main (String[] args) {
        Airaft airaft,airaft1,airaft2,airaft3,airaft4;

        airaft = new Helicopter ();
        airaft.takeoff ();
        airaft.fly ();

        airaft1 = new AirPlane ();
        airaft1.takeoff ();
        airaft1.fly ();

        airaft2 = new Fighter ();
        airaft2.takeoff ();
        airaft2.fly ();

        airaft3 = new Harrier ();
        airaft3.takeoff ();
        airaft3.fly ();

    }
}
