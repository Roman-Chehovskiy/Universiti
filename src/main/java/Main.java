public class Main {

    public static void main(String[] args) {

        University university = new University("1", "Сибирский государственный медицинский университет", "СибГМУ", 1991, StudyProfile.MEDICINE);
        Student student = new Student("Иванов Иван Иванович", "1", 2, 0);
        System.out.println(university);
        System.out.println(student);
    }
}
