package mission_1;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, Double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public Aspirant() {
    }

    @Override
    public Integer getScholarship() {
        if (averageMark == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }
}
