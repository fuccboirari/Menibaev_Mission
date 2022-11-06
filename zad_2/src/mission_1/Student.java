package mission_1;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    protected Double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public Integer getScholarship(){
        if (averageMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }
}
