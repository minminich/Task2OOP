public class Course {
    private String id;
    private Subject subject;
    private Teacher teacher;
    private Group group;

    public Course(String id, Subject subject, Teacher teacher, Group group) {
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        this.group = group;
        group.addCourse(this);
    }

    public String getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }
}
