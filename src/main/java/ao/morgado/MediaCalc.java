package ao.morgado;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class MediaCalc {
    public abstract double calcMediaT();
   // public abstract double calcMediaF();

    protected double calc(double p1, double p2, double mac) {
        double m = (p1+p2+mac)/3;
        System.out.println("M: "+
                BigDecimal
                    .valueOf(m)
                    .setScale(1, RoundingMode.HALF_UP)
        );
        return m;
    }
}
