package ao.morgado;

public class Calcs
    extends MediaCalc
        implements Runnable {

    double p1, p2, mac;

    public Calcs(double p1, double p2, double mac) {
        this.p1 = p1;
        this.p2 = p2;
        this.mac = mac;
    }
    
    @Override
    public void run() {
        calcMediaT();
        System.out.println("Thread calc: " + Thread.currentThread().getName());
    }

    @Override
    public double calcMediaT() {
        return super.calc(p1, p2, mac);
    }
}