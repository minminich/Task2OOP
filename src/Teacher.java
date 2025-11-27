public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private String className;

    public Teacher(int id, String firstName, String lastName, String className) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return String.format("Teacher{id=%d, name='%s %s', department='%s'}",
                id, firstName, lastName, className);
    }
}

