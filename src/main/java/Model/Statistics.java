package Model;
import Enum.StudyProfile;

public class Statistics {

    private StudyProfile profileName;
    private double averageScore;
    private int countStudent;
    private String nameUniversity;
    private int countUniversity;

    public Statistics(StudyProfile profileName, double averageScore, int countStudent, int countUniversity, String nameUniversity) {
        this.profileName = profileName;
        this.averageScore = averageScore;
        this.countStudent = countStudent;
        this.countUniversity = countUniversity;
        this.nameUniversity = nameUniversity;
    }

    public StudyProfile getProfileName() {
        return profileName;
    }

    public Statistics setProfileName(StudyProfile profileName) {
        this.profileName = profileName;
        return this;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public Statistics setAverageScore(double averageScore) {
        this.averageScore = averageScore;
        return this;
    }

    public int getCountStudent() {
        return countStudent;
    }

    public Statistics setCountStudent(int countStudent) {
        this.countStudent = countStudent;
        return this;
    }

    public int getCountUniversity() {
        return countUniversity;
    }

    public Statistics setCountUniversity(int countUniversity) {
        this.countUniversity = countUniversity;
        return this;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public Statistics setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
        return this;
    }

    @Override
    public String toString() {
        return "Профиль университета " + profileName + " Название университета " + nameUniversity + " Количество университетов по профилю " + countUniversity +
                " Количество студентов по профилю " + countStudent + " Средний бвл студентов " + averageScore;
    }
}
