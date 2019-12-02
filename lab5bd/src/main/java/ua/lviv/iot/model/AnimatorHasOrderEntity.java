package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "animator_has_order", schema = "animator", catalog = "")
@IdClass(AnimatorHasOrderEntityPK.class)
public class AnimatorHasOrderEntity {
    private int animatorIdAnimator;
    private int orderIdOrder;

    @Id
    @Column(name = "Animator_idAnimator")
    public int getAnimatorIdAnimator() {
        return animatorIdAnimator;
    }

    public void setAnimatorIdAnimator(int animatorIdAnimator) {
        this.animatorIdAnimator = animatorIdAnimator;
    }

    @Id
    @Column(name = "Order_idOrder")
    public int getOrderIdOrder() {
        return orderIdOrder;
    }

    public void setOrderIdOrder(int orderIdOrder) {
        this.orderIdOrder = orderIdOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimatorHasOrderEntity that = (AnimatorHasOrderEntity) o;

        if (animatorIdAnimator != that.animatorIdAnimator) return false;
        if (orderIdOrder != that.orderIdOrder) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = animatorIdAnimator;
        result = 31 * result + orderIdOrder;
        return result;
    }

    public AnimatorHasOrderEntity() {
    }

    public AnimatorHasOrderEntity(int animatorIdAnimator, int orderIdOrder) {
        this.animatorIdAnimator = animatorIdAnimator;
        this.orderIdOrder = orderIdOrder;
    }

    @Override
    public String toString() {
        return "AnimatorHasOrderEntity{" +
                "animatorIdAnimator=" + animatorIdAnimator +
                ", orderIdOrder=" + orderIdOrder +
                '}';
    }
}
