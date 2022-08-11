import Comparator.*;
import Model.Info;
import Model.Statistics;
import Util.*;
import Model.Student;
import Model.University;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    static {
        try {
            LogManager.getLogManager().readConfiguration(Main.class.getResourceAsStream("logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        logger.log(Level.INFO, "Старт программы");

        List<Student> studentList = LoadStudentAndUniversiti.LoadStudent();
        List<University> universityList = LoadStudentAndUniversiti.LoadUnuversity();
        List<Statistics> statisticsList = CreateStatistics.createStatisticsList(studentList, universityList);
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

        Info info = new Info();
        info.setStudentList(studentList);
        info.setUniversityList(universityList);
        info.setStatisticsList(statisticsList);
        info.setDateCreate(Calendar.getInstance());

        XmlWrite.XmlWriter(info);
        JsonWrite.writeJson(info);
        XlsWriter.write(statisticsList, "C:\\Users\\Роман\\Desktop\\учеба\\university\\src\\main\\resources\\statistics.xlsx");

        logger.log(Level.INFO, "Завершение работы программы");
    }
}
