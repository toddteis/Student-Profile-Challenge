public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("John", "Smith", 6.5, 2024, "Software Engineer");
        studentA.printStudentDetails();
        studentA.addYear();
        studentA.printStudentDetails();
    }
}
