public class Student {
    public int id;
    private String firstName;
    private String lastName;
    private Group group;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Group getGroup() { return group; }
    public void setGroup(Group group) { this.group = group; }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s %s', group=%s}",
                id, firstName, lastName, group != null ? group.getName() : "No group");
    }
}

