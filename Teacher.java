public class Teacher extends User {
    private String teacherId;
    

    public Teacher(String firstName, String secondName, String lastName, String teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher  teacherId=" + teacherId + " firstName=" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +"]";
    }

    

    
    
}
