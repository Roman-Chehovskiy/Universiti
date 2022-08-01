package Comparator;

import Model.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityFullNameComparator implements CompareUniversity {
    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getFullName(), university2.getFullName());
    }
}
