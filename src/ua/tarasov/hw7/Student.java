package ua.tarasov.hw7;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(GraduateStudent gradStud) {
        this.firstName = gradStud.firstName;
        this.lastName = gradStud.lastName;
        this.group = gradStud.group;
        this.averageMark = gradStud.averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    protected int getScholarship() {
        return averageMark == 5 ? 100 : 80;
    }
}
