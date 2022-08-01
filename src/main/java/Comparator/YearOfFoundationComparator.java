package Comparator;

import Model.University;

public class YearOfFoundationComparator implements CompareUniversity {
    @Override
    public int compare(University university1, University university2) {
        return Integer.compareUnsigned(university1.getYearOfFoundation(), university2.getYearOfFoundation());
    }
}
