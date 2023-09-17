public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearOfTeaching;


    public Teacher(String firstName, String lastName, String subject, int yearOfTeaching) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearOfTeaching = yearOfTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}









