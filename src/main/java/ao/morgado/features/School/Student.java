package ao.morgado.features.School;

public abstract class Student {

    int studentID;
    double p1;
    double p2;
    double media;

    public Student(int studentID, double p1, double p2) {
        this.studentID = studentID;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void printStudentData() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("P1: " + this.p1);
        System.out.println("P2: " + this.p2);
    }

    protected abstract double setMedia();
}
