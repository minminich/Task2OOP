import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Timetable {
    private Map<Group, List<Lesson>> groups = new HashMap<>();

    public void addLesson(Lesson lesson) {
        Group group = lesson.getCourse().getGroup();

        if (!groups.containsKey(group)) {
            groups.put(group, new ArrayList<>());
        }
        groups.get(group).add(lesson);

    }

    public List<Lesson> getGroupTimetable(Group group) {
        return groups.getOrDefault(group, new ArrayList<>());
    }

}
