import java.time.DayOfWeek;
import java.time.LocalTime;

public class TimetableApp {
    public static void main(String[] args) {

        Timetable timetable = new Timetable();

        Subject sj1 = new Subject("s1", "Компьютерная графика", "лекция");
        Subject sj2 = new Subject("s2", "Компьютерная графика", "практика");
        Subject sj3 = new Subject("s3", "Теория вероятносей", "практика");
        Subject sj4 = new Subject("s4", "Физкультура");
        Subject sj5 = new Subject("s5", "Иностранный язык", "практика");
        Subject sj6 = new Subject("s6", "Политическая наука и технологии", "практика");
        Subject sj7 = new Subject("s7", "Основы Python", "практика");

        Teacher teacher1 = new Teacher("t1", "Косенко И.М.");
        Teacher teacher2 = new Teacher("t2", "Некипелов Е.А.");
        Teacher teacher3 = new Teacher("t3", "Гавриш О.А.");
        Teacher teacher4 = new Teacher("t4", "Гончаров Л.А.");
        Teacher teacher5 = new Teacher("t5", "Дылевский А.В.");

        Group group = new Group("1", "Группа 3");

        Student student1 = new Student("s1", "Корчагина Анастасия");
        Student student2 = new Student("s2", "Османова Аминат");
        Student student3 = new Student("s3", "Черевко Дарья");
        Student student4 = new Student("s4", "Щетинина Виктория");

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);

        Course course1 = new Course("c1", sj1, teacher1, group);
        Course course2 = new Course("c2", sj2, teacher1, group);
        Course course3 = new Course("c3", sj3, teacher2, group);
        Course course4 = new Course("c4", sj5, teacher3, group);
        Course course5 = new Course("c5", sj6, teacher4, group);
        Course course6 = new Course("c6", sj7, teacher5, group);

        Lesson lesson1 = new Lesson(course1, DayOfWeek.MONDAY, LocalTime.of(8, 0),
                LocalTime.of(9, 35), "316п");
        Lesson lesson2 = new Lesson(course2, DayOfWeek.MONDAY, LocalTime.of(9, 45),
                LocalTime.of(11, 20), "477");
        Lesson lesson3 = new Lesson(course3, DayOfWeek.MONDAY, LocalTime.of(11, 30),
                LocalTime.of(13, 5), "307п");
        Lesson lesson4 = new Lesson(course4, DayOfWeek.TUESDAY, LocalTime.of(8, 0),
                LocalTime.of(9, 35), "309п");
        Lesson lesson5 = new Lesson(course5, DayOfWeek.TUESDAY, LocalTime.of(9, 45),
                LocalTime.of(11, 20), "307п");
        Lesson lesson6 = new Lesson(course6, DayOfWeek.TUESDAY, LocalTime.of(11, 30),
                LocalTime.of(13, 5), "385");

        timetable.addLesson(lesson1);
        timetable.addLesson(lesson2);
        timetable.addLesson(lesson3);
        timetable.addLesson(lesson4);
        timetable.addLesson(lesson5);
        timetable.addLesson(lesson6);


        System.out.println("Расписание группы 3");

        for (Lesson lesson : timetable.getGroupTimetable(group)) {
            String day = switch (lesson.getDayOfWeek()) {
                case MONDAY -> "Пн";
                case TUESDAY -> "Вт";
                case WEDNESDAY -> "Ср";
                case THURSDAY -> "Чт";
                case FRIDAY -> "Пт";
                case SATURDAY -> "Сб";
                case SUNDAY -> "Вс";
            };

            System.out.printf("%-11s | %02d:%02d–%02d:%02d | %-30s | %s%n",
                    day,
                    lesson.getStartTime().getHour(), lesson.getStartTime().getMinute(),
                    lesson.getEndTime().getHour(), lesson.getEndTime().getMinute(),
                    lesson.getCourse().getSubject().getName() + lesson.getCourse().getSubject().getInfo(),
                    lesson.getRoom()
            );
        }
    }
}
