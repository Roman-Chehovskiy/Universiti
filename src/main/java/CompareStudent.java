import java.util.Comparator;

public interface CompareStudent extends Comparator<Student> {
    int compare(Student student1, Student student2);
}
