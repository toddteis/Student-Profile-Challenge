public class Main {
    public static void main(String[] args) {
        StudentProfile studentA = new StudentProfile("John", "Smith", 6.5, 2024, "Software Engineer");
        System.out.println("Name: " + studentA.firstName + " " + studentA.lastName);
        System.out.println("GPA: " + studentA.gpa);
        System.out.println("Graduate Year: " + studentA.graduateYear);
        System.out.println("Major: " + studentA.major);

        studentA.addYear();

        System.out.println("Graduate Year: " + studentA.graduateYear);
    }
}
