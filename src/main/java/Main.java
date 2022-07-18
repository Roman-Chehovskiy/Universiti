import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = LoadStudentAndUniversiti.LoadStudent();
        List<University> universityList = LoadStudentAndUniversiti.LoadUnuversity();
        List<CompareStudent> compareStudentList = new ArrayList<>();
        List<CompareUniversity> compareUniversityList = new ArrayList<>();

        compareStudentList.add(DefineComparator.GetComparator(StudentEnumComparator.UNIVERSITY_ID_COMPARATOR));
        compareStudentList.add(DefineComparator.GetComparator(StudentEnumComparator.FULL_NAME_COMPARATOR));
        compareStudentList.add(DefineComparator.GetComparator(StudentEnumComparator.AVG_EXAM_SCORE_COMPARATOR));
        compareStudentList.add(DefineComparator.GetComparator(StudentEnumComparator.CURRENT_COURSE_NUMBER_COMPARATOR));

        compareUniversityList.add(DefineComparator.GetComparator(UniversityEnumComparator.UNIVERSITY_ID_COMPARATOR));
        compareUniversityList.add(DefineComparator.GetComparator(UniversityEnumComparator.UNIVERSITY_FULL_NAME_COMPARATOR));
        compareUniversityList.add(DefineComparator.GetComparator(UniversityEnumComparator.SHORT_NAME_COMPARATOR));
        compareUniversityList.add(DefineComparator.GetComparator(UniversityEnumComparator.YEAR_OF_FOUNDATION_COMPARATOR));
        compareUniversityList.add(DefineComparator.GetComparator(UniversityEnumComparator.STUDY_PROFILE_COMPARATOR));

        for (int i = 0; i < compareStudentList.size(); i++) {
            studentList.stream().sorted(compareStudentList.get(0)).forEach(System.out::println);
            System.out.println();
        }
       for (int i = 0; i < compareUniversityList.size(); i++) {
           universityList.stream().sorted(compareUniversityList.get(i)).forEach(System.out::println);
           System.out.println();
       }
    }
}
