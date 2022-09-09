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
}
