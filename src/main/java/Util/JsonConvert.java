package Util;

import Model.Statistics;
import Model.Student;
import Model.University;
import com.google.gson.*;

import java.util.ArrayList;
import java.util.List;

public class JsonConvert {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private JsonConvert() {
    }

    public static String gsonStudent(Student student) {
        return gson.toJson(student);
    }

    public static String jsonToStringStatistics(Statistics statistics) { return gson.toJson(statistics);}

    public static String gsonUniversity(University university) {
       return gson.toJson(university);
    }

    public static List<String> javaToJson(List list) throws Exception {
        List<String> stringList = new ArrayList<>();
       if (list.get(0) instanceof Student) {
           for (Object student : list) {
               stringList.add(gsonStudent((Student) student));
           }
       } else if (list.get(0) instanceof University) {
           for (Object university : list) {
               stringList.add(gsonUniversity((University) university));
           }
       } else if (list.get(0) instanceof Statistics) {
           for (Object statistics : list) {
               stringList.add(jsonToStringStatistics((Statistics)statistics));
           }
       } else {
           throw new Exception();

           }
        return stringList;
    }

    public static Student gsonToStudent(String studentString) {
        return gson.fromJson(studentString, Student.class);
    }

    public static University gsonToUniversity(String universityString) {
        return gson.fromJson(universityString, University.class);
    }

    public static List<Student> gsonToStudentList(List<String> studentString) {
        List<Student> studentList = new ArrayList<>();
        for (String student : studentString) {
            studentList.add(gsonToStudent(student));
        }
        return studentList;
    }

    public static List<University> gsonToUniversityList(List<String> universityString) {
        List<University> universityList = new ArrayList<>();
        for (String university : universityString) {
            universityList.add(gsonToUniversity(university));
        }
        return universityList;
    }
}
