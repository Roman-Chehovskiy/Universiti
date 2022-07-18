public enum StudyProfile {
    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    MEDICINE("Медицина"),
    LINGUISTICS("Лингвистика");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }


    @Override
    public String toString() {
        return  profileName;
    }
}
