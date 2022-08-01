package Model;

import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("Name")
    private String fullName;
    @SerializedName("Id")
    private String universityId;
    @SerializedName("Cours Mumber")
    private int currentCourseNumber;
    @SerializedName("average score")
    private double avgExamScore;

    public Student(String fullName, String universityId) {
        this.fullName = fullName;
        this.universityId = universityId;
    }

    public Student(String fullName, String universityId, int currentCourseNumber) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
    }

    public Student(String fullName, String universityId, double avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.avgExamScore = avgExamScore;
    }

    public Student(String fullName, String universityId, int currentCourseNumber, double avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public String getFullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUniversityId() {
        return universityId;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public double getAvgExamScore() {
        return avgExamScore;
    }

    public Student setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    @Override
    public String toString() {
        return "Id университета " + universityId + " Имя студента: " + fullName + ", Курс: " + currentCourseNumber + ", Средний бал: " + avgExamScore;
    }
}
