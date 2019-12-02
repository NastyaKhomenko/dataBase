package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "animator", schema = "animator", catalog = "")
public class AnimatorEntity {
    private int idAnimator;
    private String name;
    private String surname;
    private String lastName;
    private String photo;
    private String education;
    private Integer experience;
    private int age;
    private String additionalSkills;

    @Id
    @Column(name = "idAnimator")
    public int getIdAnimator() {
        return idAnimator;
    }

    public void setIdAnimator(int idAnimator) {
        this.idAnimator = idAnimator;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "experience")
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "additionalSkills")
    public String getAdditionalSkills() {
        return additionalSkills;
    }

    public void setAdditionalSkills(String additionalSkills) {
        this.additionalSkills = additionalSkills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimatorEntity that = (AnimatorEntity) o;

        if (idAnimator != that.idAnimator) return false;
        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;
        if (experience != null ? !experience.equals(that.experience) : that.experience != null) return false;
        if (additionalSkills != null ? !additionalSkills.equals(that.additionalSkills) : that.additionalSkills != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAnimator;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (additionalSkills != null ? additionalSkills.hashCode() : 0);
        return result;
    }

    public AnimatorEntity() {
    }

    public AnimatorEntity(int idAnimator, String name, String surname, String lastName, String photo, String education, Integer experience, int age, String additionalSkills) {
        this.idAnimator = idAnimator;
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        this.photo = photo;
        this.education = education;
        this.experience = experience;
        this.age = age;
        this.additionalSkills = additionalSkills;
    }

    @Override
    public String toString() {
        return "AnimatorEntity{" +
                "idAnimator=" + idAnimator +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", photo='" + photo + '\'' +
                ", education='" + education + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                ", additionalSkills='" + additionalSkills + '\'' +
                '}';
    }
}
