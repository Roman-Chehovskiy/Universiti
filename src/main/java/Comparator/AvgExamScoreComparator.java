package Comparator;

import Model.Student;

public class AvgExamScoreComparator implements CompareStudent {
    @Override
    public int compare(Student student1, Student student2) {
        return (Double.compare(student1.getAvgExamScore(), student2.getAvgExamScore())) * -1;
    }
}
