public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("John", "Smith", 6.5, 2024, "Software Engineer");
        studentA.printStudentDetails();
        studentA.setFirstName("Tom");
        studentA.setLastName("Jones");
        studentA.setGpa(5.4);
        studentA.setGraduateYear(2026);
        studentA.setMajor("Civil Engineering");
        studentA.printStudentDetails();
        studentA.addYear();
        StudentProfile studentB = new StudentProfile("Jill", "Boyle", 7.0, 2026, "Marketing");
        studentB.printStudentDetails();
    }
}
