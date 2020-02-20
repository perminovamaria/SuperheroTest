public class SuperHeroModel {

    private String birthDate;
    private String city;
    private String fullName;
    private String gender;
    private String id;
    private String mainSkill;
    private String phone;

    public SuperHeroModel(String birthDate, String city, String fullName, String gender, String id, String mainSkill, String phone) {
        this.birthDate = birthDate;
        this.city = city;
        this.fullName = fullName;
        this.gender = gender;
        this.id = id;
        this.mainSkill = mainSkill;
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainSkill() {
        return mainSkill;
    }

    public void setMainSkill(String mainSkill) {
        this.mainSkill = mainSkill;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
