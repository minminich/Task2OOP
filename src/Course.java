public class Course {
    private int id;
    private String name;
    private int number;

    public Course(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getNumber() { return number; }

    @Override
    public String toString() {
            return String.format("Course{id=%d, name='%s', number=%d}", id, name, number);
    }
}
