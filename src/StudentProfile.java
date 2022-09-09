public class StudentProfile {
    public String firstName;
    public String lastName;
    public Double gpa;
    public Integer graduateYear;
    public String major;

    public StudentProfile(String firstName, String lastName, Double gpa, Integer graduateYear, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.graduateYear = graduateYear;
        this.major = major;
    }

    public void addYear() {
        this.graduateYear += 1;
    }

    public void printStudentDetails() {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Graduate Year: " + this.graduateYear);
        System.out.println("Major: " + this.major);
    }
}
