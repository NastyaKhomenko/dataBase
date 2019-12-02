package ua.lviv.iot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AgencyHasAnimatorEntityPK implements Serializable {
    private int agencyIdAgency;
    private int animatorIdAnimator;

    @Column(name = "Agency_idAgency")
    @Id
    public int getAgencyIdAgency() {
        return agencyIdAgency;
    }

    public void setAgencyIdAgency(int agencyIdAgency) {
        this.agencyIdAgency = agencyIdAgency;
    }

    @Column(name = "Animator_idAnimator")
    @Id
    public int getAnimatorIdAnimator() {
        return animatorIdAnimator;
    }

    public void setAnimatorIdAnimator(int animatorIdAnimator) {
        this.animatorIdAnimator = animatorIdAnimator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyHasAnimatorEntityPK that = (AgencyHasAnimatorEntityPK) o;

        if (agencyIdAgency != that.agencyIdAgency) return false;
        if (animatorIdAnimator != that.animatorIdAnimator) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agencyIdAgency;
        result = 31 * result + animatorIdAnimator;
        return result;
    }

    public AgencyHasAnimatorEntityPK() {
    }

    public AgencyHasAnimatorEntityPK(int agencyIdAgency, int animatorIdAnimator) {
        this.agencyIdAgency = agencyIdAgency;
        this.animatorIdAnimator = animatorIdAnimator;
    }

    @Override
    public String toString() {
        return "AgencyHasAnimatorEntityPK{" +
                "agencyIdAgency=" + agencyIdAgency +
                ", animatorIdAnimator=" + animatorIdAnimator +
                '}';
    }
}
