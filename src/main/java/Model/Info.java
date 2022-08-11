package Model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {

    @XmlElementWrapper(name = "studentsInfo")
    @XmlElement(name = "studentEntry")
    private static List<Student> studentList = new ArrayList<Student>();

    @XmlElementWrapper(name = "universitiesInfo")
    @XmlElement(name = "universityEntry")
    private static List<University> universityList = new ArrayList<University>();

    @XmlElementWrapper(name = "statisticsInfo")
    @XmlElement(name = "statisticsEntry")
    private static List<Statistics> statisticsList = new ArrayList<>();

    @XmlTransient
    private static Calendar dateCreate;


    public static Calendar getDateCreate() {
        return dateCreate;
    }

    public static void setDateCreate(Calendar dateCreate) {
        Info.dateCreate = dateCreate;
    }

    public static List<University> getUniversityList() {
        return universityList;
    }

    public static void setUniversityList(List<University> universityList) {
        Info.universityList = universityList;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Info.studentList = studentList;
    }

    public static List<Statistics> getStatisticsList() {
        return statisticsList;
    }

    public static void setStatisticsList(List<Statistics> statisticsList) {
        Info.statisticsList = statisticsList;
    }
}
