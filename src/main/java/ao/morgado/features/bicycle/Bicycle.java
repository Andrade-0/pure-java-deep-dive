package ao.morgado.features.bicycle;

public class Bicycle {

    int gear;
    int cadence;
    int speed;

    public void setSpeed (int newValue) { this.speed = newValue; }

    public void setGear (int newValue) { this.gear = newValue; }

    public void printStates() {
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}
