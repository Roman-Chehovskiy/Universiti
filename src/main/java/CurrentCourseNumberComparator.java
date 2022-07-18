public class CurrentCourseNumberComparator implements CompareStudent {
    public int compare(Student student1, Student student2) {
        return Integer.compareUnsigned(student1.getCurrentCourseNumber(), student2.getCurrentCourseNumber());
    }
}
