package Model;

import com.google.gson.annotations.SerializedName;
import Enum.StudyProfile;

import java.util.Objects;

public class University {

    private String id;
    @SerializedName("Name University")
    private String fullName;
    @SerializedName("Short Name")
    private String shortName;
    @SerializedName("Year Of Foundation")
    private int yearOfFoundation;
    @SerializedName("Specialization")
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

    public String getId() {
        return id;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

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

