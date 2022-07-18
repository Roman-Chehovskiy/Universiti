import org.apache.commons.lang3.StringUtils;

public class IdComparator implements CompareUniversity {
    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getId(), university2.getId());
    }
}
