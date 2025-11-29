public class Subject {
    private String id;
    private String name;
    private String info;

    public Subject(String id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getInfo() {
        return info;
    }
}
