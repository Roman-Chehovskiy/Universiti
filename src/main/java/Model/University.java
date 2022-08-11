package Model;

import com.google.gson.annotations.SerializedName;
import Enum.StudyProfile;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class University {

    @XmlElement(name = "universityId")
    private String id;
    @SerializedName("Name University")
    @XmlElement(name = "universityName")
    private String fullName;
    @SerializedName("Short Name")
    @XmlTransient
    private String shortName;
    @SerializedName("Year Of Foundation")
    @XmlTransient
    private int yearOfFoundation;
    @SerializedName("universityProfile")
    @XmlElement(name = "universityProfile")
    private StudyProfile mainProfile;

    public University() {
    }

    public University(String id, String fullName, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.mainProfile = mainProfile;
        this.shortName = "Не указано";
    }

    public University(String id, String fullName, String shortName, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.mainProfile = mainProfile;
    }

    public University(String id, String fullName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
        this.shortName = "Не указано";
    }

    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    @XmlTransient
    public String getId() {
        return id;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    @XmlTransient
    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @XmlTransient
    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @XmlTransient
    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    @XmlTransient
    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public University setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }


    @Override
    public String toString() {
        return "Id университета " + id + " Название университета: " + fullName + ", Сокращенное название: " + shortName + ", Год основания: " + yearOfFoundation + " Специализация " + mainProfile;
    }


}


