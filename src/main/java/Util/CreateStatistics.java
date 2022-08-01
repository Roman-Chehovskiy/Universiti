package Util;

import Comparator.DefineComparator;
import Comparator.StudentEnumComparator;
import Comparator.UniversityEnumComparator;
import Comparator.UniversityIdComparator;
import Model.Statistics;
import Model.Student;
import Model.University;


import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class CreateStatistics {

    private CreateStatistics() {
    }

    public static List<Statistics> createStatisticsList(List<Student> studentList, List<University> universityList) {
        List<University> universities = new ArrayList<>(universityList.stream().sorted(DefineComparator.GetComparator(UniversityEnumComparator.STUDY_PROFILE_COMPARATOR)).collect(Collectors.toList()));
        List<Statistics> statisticsList = new ArrayList<>();
        double averageScore;
        double averageScoreUniversity;
        int countUniversity;
        while (universities.size() != 0) {
            University university = universities.get(0);
            averageScore = 0;
            averageScoreUniversity = 0;
            countUniversity = 0;
            int countStudent = 0;
            int i = 0;
            while (universities.size() != 0) {
                University university1 = universities.get(i);
                if (university.getMainProfile().equals(university1.getMainProfile())) {
                    countUniversity++;
                    for (Student student : studentList) {
                        if (student.getUniversityId().equals(university1.getId())) {
                            countStudent++;
                            averageScore = averageScore + student.getAvgExamScore();
                        }
                    }
                    universities.remove(i);
                } else break;
            }
            if (countStudent != 0) {
                BigDecimal bigAverageScore = new BigDecimal(averageScore / countStudent);
                bigAverageScore = bigAverageScore.setScale(2, 4);
                averageScoreUniversity = bigAverageScore.doubleValue();
            }
            statisticsList.add(new Statistics(university.getMainProfile(), averageScoreUniversity, countStudent, countUniversity, university.getFullName()));
            universities.remove(university);
        }
        return statisticsList;
    }
}
