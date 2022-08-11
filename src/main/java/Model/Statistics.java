package Model;
import Enum.StudyProfile;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class Statistics {

    @SerializedName("universityProfile")
    @XmlElement(name = "universityProfile")
    private StudyProfile profileName;
    @SerializedName("average score")
    @XmlElement(name = "avgScore")
    private double averageScore;
    @XmlElement(name = "countStudent")
    private int countStudent;
    @SerializedName("Name University")
    @XmlElement(name = "universityName")
    private String nameUniversity;
    @XmlElement(name = "countUniversity")
    private int countUniversity;

    public Statistics(StudyProfile profileName, double averageScore, int countStudent, int countUniversity, String nameUniversity) {
        this.profileName = profileName;
        this.averageScore = averageScore;
        this.countStudent = countStudent;
        this.countUniversity = countUniversity;
        this.nameUniversity = nameUniversity;
    }

    @XmlTransient
    public StudyProfile getProfileName() {
        return profileName;
    }

    public Statistics setProfileName(StudyProfile profileName) {
        this.profileName = profileName;
        return this;
    }

    @XmlTransient
    public double getAverageScore() {
        return averageScore;
    }

    public Statistics setAverageScore(double averageScore) {
        this.averageScore = averageScore;
        return this;
    }

    @XmlTransient
    public int getCountStudent() {
        return countStudent;
    }

    public Statistics setCountStudent(int countStudent) {
        this.countStudent = countStudent;
        return this;
    }

    @XmlTransient
    public int getCountUniversity() {
        return countUniversity;
    }

    public Statistics setCountUniversity(int countUniversity) {
        this.countUniversity = countUniversity;
        return this;
    }

    @XmlTransient
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
