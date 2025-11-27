import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private int courseNumber;
    private List<Student> students;

    public Group(String name, int courseNumber) {
        this.name = name;
        this.courseNumber = courseNumber;
        this.students = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getCourseNumber() { return courseNumber; }
    public List<Student> getStudents() { return students; }

    public void addStudent(Student student) {
        students.add(student);
        student.setGroup(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setGroup(null);
    }


    @Override
    public String toString() {
        return String.format("Group{name='%s', course=%d, students=%d}",
                name, courseNumber, students.size());
    }
}
