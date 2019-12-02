package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "agency_has_animator", schema = "animator", catalog = "")
@IdClass(AgencyHasAnimatorEntityPK.class)
public class AgencyHasAnimatorEntity {
    private int agencyIdAgency;
    private int animatorIdAnimator;

    @Id
    @Column(name = "Agency_idAgency")
    public int getAgencyIdAgency() {
        return agencyIdAgency;
    }

    public void setAgencyIdAgency(int agencyIdAgency) {
        this.agencyIdAgency = agencyIdAgency;
    }

    @Id
    @Column(name = "Animator_idAnimator")
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

        AgencyHasAnimatorEntity that = (AgencyHasAnimatorEntity) o;

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

    public AgencyHasAnimatorEntity() {
    }

    public AgencyHasAnimatorEntity(int agencyIdAgency, int animatorIdAnimator) {
        this.agencyIdAgency = agencyIdAgency;
        this.animatorIdAnimator = animatorIdAnimator;
    }

    @Override
    public String toString() {
        return "AgencyHasAnimatorEntity{" +
                "agencyIdAgency=" + agencyIdAgency +
                ", animatorIdAnimator=" + animatorIdAnimator +
                '}';
    }
}
