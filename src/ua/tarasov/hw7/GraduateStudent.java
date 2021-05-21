package ua.tarasov.hw7;

public class GraduateStudent extends Student {
    String scienceWork;

    public GraduateStudent(String firstName, String lastName, String group, String scienceWork, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    protected int getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }
}
