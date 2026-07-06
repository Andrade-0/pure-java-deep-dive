package ao.morgado.features.radio;

public class Radio {

    // fields (states)
    boolean power = false;
    int currentStation = 0;
    int currentVolume = 0;

    // methods (behaviors)
    public void setPower (boolean newValue) {
         power = newValue;
    }

    public void increaseVolume(int newValue) { currentVolume += newValue; }

    public void decreaseVolume (int newValue) {
        currentVolume -= newValue;
    }

    public void nextStation() { currentStation++; }

    public void prevStation() { currentStation--; }

    public void printStates(String model) {
        System.out.println("\nModel: " + model);
        System.out.println("Power: " + power);
        System.out.println("Current Station: " + currentStation);
        System.out.println("Current Volume: " + currentVolume);
    }
}