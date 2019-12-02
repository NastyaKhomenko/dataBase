package ua.lviv.iot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CostEntityPK implements Serializable {
    private int idPrice;
    private int agencyIdAgency;

    @Column(name = "idPrice")
    @Id
    public int getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(int idPrice) {
        this.idPrice = idPrice;
    }

    @Column(name = "Agency_idAgency")
    @Id
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

        CostEntityPK that = (CostEntityPK) o;

        if (idPrice != that.idPrice) return false;
        if (agencyIdAgency != that.agencyIdAgency) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPrice;
        result = 31 * result + agencyIdAgency;
        return result;
    }

    public CostEntityPK() {
    }

    public CostEntityPK(int idPrice, int agencyIdAgency) {
        this.idPrice = idPrice;
        this.agencyIdAgency = agencyIdAgency;
    }

    @Override
    public String toString() {
        return "CostEntityPK{" +
                "idPrice=" + idPrice +
                ", agencyIdAgency=" + agencyIdAgency +
                '}';
    }
}
