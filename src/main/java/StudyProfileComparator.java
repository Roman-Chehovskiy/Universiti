import org.apache.commons.lang3.StringUtils;

public class StudyProfileComparator implements CompareUniversity {
    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getMainProfile().toString(), university2.getMainProfile().toString());
    }
}
