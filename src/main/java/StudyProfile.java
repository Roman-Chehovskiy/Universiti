public enum StudyProfile {
    MEDICINE("Медицина"),
    ECONOMY("Экономика"),
    JURISPRUDENCE("Юриспруденция"),
    BOTANY ("Ботаника"),
    AGRARIAN ("Сельское хозйство");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }


    @Override
    public String toString() {
        return " Специализация: " + profileName;
    }
}
