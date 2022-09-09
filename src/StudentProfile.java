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
        System.out.println();
        System.out.println("Graduate year for " + this.firstName + " " + this.lastName + " has been incremented to " + this.graduateYear);
        System.out.println();
    }

    public void printStudentDetails() {
        System.out.println();
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Graduate Year: " + this.graduateYear);
        System.out.println("Major: " + this.major);
        System.out.println();
    }
}
