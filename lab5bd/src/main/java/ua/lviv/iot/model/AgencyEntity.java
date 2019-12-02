package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "agency", schema = "animator", catalog = "")
public class AgencyEntity {
    private int idAgency;
    private String name;
    private String address;
    private int phoneNumber;
    private String webSite;
    private Integer raiting;

    @Id
    @Column(name = "idAgency")
    public int getIdAgency() {
        return idAgency;
    }

    public void setIdAgency(int idAgency) {
        this.idAgency = idAgency;
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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phoneNumber")
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "webSite")
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Basic
    @Column(name = "raiting")
    public Integer getRaiting() {
        return raiting;
    }

    public void setRaiting(Integer raiting) {
        this.raiting = raiting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyEntity that = (AgencyEntity) o;

        if (idAgency != that.idAgency) return false;
        if (phoneNumber != that.phoneNumber) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (webSite != null ? !webSite.equals(that.webSite) : that.webSite != null) return false;
        if (raiting != null ? !raiting.equals(that.raiting) : that.raiting != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAgency;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + phoneNumber;
        result = 31 * result + (webSite != null ? webSite.hashCode() : 0);
        result = 31 * result + (raiting != null ? raiting.hashCode() : 0);
        return result;
    }

    public AgencyEntity() {
    }

    public AgencyEntity(int idAgency, String name, String address, int phoneNumber, String webSite, Integer raiting) {
        this.idAgency = idAgency;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.webSite = webSite;
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return "AgencyEntity{" +
                "idAgency=" + idAgency +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", webSite='" + webSite + '\'' +
                ", raiting=" + raiting +
                '}';
    }
}
