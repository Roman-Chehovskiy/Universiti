package Comparator;

import java.util.Comparator;
import Model.University;

public interface CompareUniversity extends Comparator<University> {
    int compare(University university1, University university2);
}
