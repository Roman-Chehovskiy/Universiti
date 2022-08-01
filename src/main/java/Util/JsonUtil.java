package Util;

import Model.Student;
import Model.University;
import com.google.gson.*;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private JsonUtil() {
    }

    public static String gsonStudent(Student student) {
        return gson.toJson(student);
    }

    public static String gsonUniversity(University university) {
       return gson.toJson(university);
    }

    public static List<String> gsonListStudent(List<Student> listStudent) {
        List<String> studentString = new ArrayList<>();
        for (Student student : listStudent) {
            studentString.add(gsonStudent(student));
        }
        return studentString;
    }

    public static List<String> gsonListUniversity(List<University> listUniversity) {
        List<String> universityString = new ArrayList<>();
        for (University university : listUniversity) {
            universityString.add(gsonUniversity(university));
        }
        return universityString;
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
