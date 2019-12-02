package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "cost", schema = "animator", catalog = "")
@IdClass(CostEntityPK.class)
public class CostEntity {
    private int idPrice;
    private int forWedding;
    private int forChildBirthday;
    private int forAdultBirthday;
    private int forFirstBell;
    private int forLastBell;
    private int agencyIdAgency;

    @Id
    @Column(name = "idPrice")
    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    @Basic
    @Column(name = "forWedding")
    public int getForWedding() {
        return forWedding;
    }

    public void setForWedding(int forWedding) {
        this.forWedding = forWedding;
    }

    @Basic
    @Column(name = "forChildBirthday")
    public int getForChildBirthday() {
        return forChildBirthday;
    }

    public void setForChildBirthday(int forChildBirthday) {
        this.forChildBirthday = forChildBirthday;
    }

    @Basic
    @Column(name = "forAdultBirthday")
    public int getForAdultBirthday() {
        return forAdultBirthday;
    }

    public void setForAdultBirthday(int forAdultBirthday) {
        this.forAdultBirthday = forAdultBirthday;
    }

    @Basic
    @Column(name = "forFirstBell")
    public int getForFirstBell() {
        return forFirstBell;
    }

    public void setForFirstBell(int forFirstBell) {
        this.forFirstBell = forFirstBell;
    }

    @Basic
    @Column(name = "forLastBell")
    public int getForLastBell() {
        return forLastBell;
    }

    public void setForLastBell(int forLastBell) {
        this.forLastBell = forLastBell;
    }

    @Id
    @Column(name = "Agency_idAgency")
    public int getAgencyIdAgency() {
        return agencyIdAgency;
    }

    public void setAgencyIdAgency(int agencyIdAgency) {
        this.agencyIdAgency = agencyIdAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CostEntity that = (CostEntity) o;

        if (idPrice != that.idPrice) return false;
        if (forWedding != that.forWedding) return false;
        if (forChildBirthday != that.forChildBirthday) return false;
        if (forAdultBirthday != that.forAdultBirthday) return false;
        if (forFirstBell != that.forFirstBell) return false;
        if (forLastBell != that.forLastBell) return false;
        if (agencyIdAgency != that.agencyIdAgency) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrice;
        result = 31 * result + forWedding;
        result = 31 * result + forChildBirthday;
        result = 31 * result + forAdultBirthday;
        result = 31 * result + forFirstBell;
        result = 31 * result + forLastBell;
        result = 31 * result + agencyIdAgency;
        return result;
    }

    public CostEntity() {
    }

    public CostEntity(int idPrice, int forWedding, int forChildBirthday, int forAdultBirthday, int forFirstBell, int forLastBell, int agencyIdAgency) {
        this.idPrice = idPrice;
        this.forWedding = forWedding;
        this.forChildBirthday = forChildBirthday;
        this.forAdultBirthday = forAdultBirthday;
        this.forFirstBell = forFirstBell;
        this.forLastBell = forLastBell;
        this.agencyIdAgency = agencyIdAgency;
    }

    @Override
    public String toString() {
        return "CostEntity{" +
                "idPrice=" + idPrice +
                ", forWedding=" + forWedding +
                ", forChildBirthday=" + forChildBirthday +
                ", forAdultBirthday=" + forAdultBirthday +
                ", forFirstBell=" + forFirstBell +
                ", forLastBell=" + forLastBell +
                ", agencyIdAgency=" + agencyIdAgency +
                '}';
    }
}
