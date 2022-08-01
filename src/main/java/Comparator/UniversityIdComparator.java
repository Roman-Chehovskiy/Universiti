package Comparator;

import Model.Student;
import org.apache.commons.lang3.StringUtils;

public class UniversityIdComparator implements CompareStudent {
    public int compare(Student student1, Student student2) {
        return StringUtils.compare(student1.getUniversityId(), student2.getUniversityId());
    }
}
