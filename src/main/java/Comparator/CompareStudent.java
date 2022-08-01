package Comparator;

import java.util.Comparator;
import Model.Student;

public interface CompareStudent extends Comparator<Student> {
    int compare(Student student1, Student student2);
}
