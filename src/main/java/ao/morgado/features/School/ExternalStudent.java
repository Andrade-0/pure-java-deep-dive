package ao.morgado.features.School;

public class ExternalStudent extends Student {

    public ExternalStudent(int studentID, double p1, double p2) {
        super(studentID, p1, p2);
    }

    @Override
    public double setMedia() {
       double md = calculateMedia(p1, p2);
       System.out.println("Media: " + md);
       return md;
    }

    private double calculateMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }
}