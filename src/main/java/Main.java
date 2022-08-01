import Comparator.*;
import Util.CreateStatistics;
import Util.JsonUtil;
import Model.Student;
import Model.University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
            studentList.stream().sorted(compareStudentList.get(i)).forEach(System.out::println);
            System.out.println();
        }
        for (int i = 0; i < compareUniversityList.size(); i++) {
            universityList.stream().sorted(compareUniversityList.get(i)).forEach(System.out::println);
            System.out.println();
        }

        universityList.stream().limit(3).map(e -> JsonUtil.gsonUniversity(e)).peek(e -> System.out.println(e)).map(e -> JsonUtil.gsonToUniversity(e)).forEach(System.out::println);
        System.out.println();
        studentList.stream().limit(2).map(e -> JsonUtil.gsonStudent(e)).peek(e -> System.out.println(e)).map(e -> JsonUtil.gsonToStudent(e)).forEach(System.out::println);
        System.out.println();

        List<String> studentString = JsonUtil.gsonListStudent(studentList);
        System.out.println(studentString);
        System.out.println();
        List<String> universityString = JsonUtil.gsonListUniversity(universityList);
        System.out.println(universityString);
        System.out.println();

        List<Student> studentListDeserial = JsonUtil.gsonToStudentList(studentString);
        studentListDeserial.stream().forEach(System.out::println);
        System.out.println();
        List<University> universityListDeserial = JsonUtil.gsonToUniversityList(universityString);
        universityListDeserial.stream().forEach(System.out::println);
        System.out.println();

        CreateStatistics.createStatisticsList(studentList, universityList).stream().forEach(System.out :: println);

        XlsWriter.writeTable(CreateStatistics.createStatisticsList(studentList, universityList), "C:\\Users\\Роман\\Desktop\\учеба\\university\\src\\main\\resources\\statistics.xlsx");
    }
}
