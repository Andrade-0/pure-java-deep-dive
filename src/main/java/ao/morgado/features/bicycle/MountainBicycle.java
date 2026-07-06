package ao.morgado.features.bicycle;

public class MountainBicycle extends Bicycle {

    int seatHeight;

    public void setSeatHeight (int newValue) { this.seatHeight = newValue; }

    @Override // Indicates that a method declaration is intended to override a method declaration in a supertype
    public void printStates() {
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
        System.out.println("Seat Height: " + seatHeight);
    }
}
