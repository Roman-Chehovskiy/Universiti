public class DefineComparator {

    private DefineComparator() {
    }

    public static CompareStudent GetComparator(StudentEnumComparator studentEnumComparator) {
       switch (studentEnumComparator) {
           case AVG_EXAM_SCORE_COMPARATOR:
               return new AvgExamScoreComparator();
           case FULL_NAME_COMPARATOR:
               return new StudentFullNameComparator();
           case UNIVERSITY_ID_COMPARATOR:
               return new UniversityIdComparator();
           case CURRENT_COURSE_NUMBER_COMPARATOR:
               return new CurrentCourseNumberComparator();
       }
       return null;
    }

    public static CompareUniversity GetComparator(UniversityEnumComparator universityEnumComparator) {
        switch (universityEnumComparator) {
            case UNIVERSITY_ID_COMPARATOR:
                return new IdComparator();
            case SHORT_NAME_COMPARATOR:
                return new ShortNameComparator();
            case YEAR_OF_FOUNDATION_COMPARATOR:
                return new YearOfFoundationComparator();
            case UNIVERSITY_FULL_NAME_COMPARATOR:
                return new UniversityFullNameComparator();
            case STUDY_PROFILE_COMPARATOR:
                return new StudyProfileComparator();
        }
        return null;
    }
}
