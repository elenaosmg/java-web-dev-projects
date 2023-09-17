
import java.util.HashMap;

public class Course {

    private String courseName;
    private String teacher;
    private HashMap <String, Student> studentName = new HashMap<>();


    public Course (String courseName, String teacher, HashMap <String,Student> studentName) {

        this.courseName = courseName;
        this.teacher = teacher;
        this.studentName = studentName;


    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public HashMap<String, Student> getStudentName() {
        return studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setStudentName(HashMap<String, Student> studentName) {
        this.studentName = studentName;
    }
}
