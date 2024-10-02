public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }


    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setSubject(String subject) {
        this.subject = subject;
    }

    protected void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
