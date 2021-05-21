package ua.tarasov.hw7;

public class Task2 {
    public static void main(String[] args) {
        GraduateStudent gradStud = new GraduateStudent("Пантелеймон", "Иванов", "вязания", "Вязание крючком вслепую", 4.5);
        Student student = gradStud;
        Student[] arrayStud = new Student[2];
        arrayStud[0] = student;
        arrayStud[1] = gradStud;
        for (Student value : arrayStud) {
            System.out.println("При средней оценке " + value.averageMark + " стипендия составляет " + value.getScholarship());
        }
    }
}
