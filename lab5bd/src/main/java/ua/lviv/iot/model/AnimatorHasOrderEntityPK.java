package ua.lviv.iot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AnimatorHasOrderEntityPK implements Serializable {
    private int animatorIdAnimator;
    private int orderIdOrder;

    @Column(name = "Animator_idAnimator")
    @Id
    public int getAnimatorIdAnimator() {
        return animatorIdAnimator;
    }

    public void setAnimatorIdAnimator(int animatorIdAnimator) {
        this.animatorIdAnimator = animatorIdAnimator;
    }

    @Column(name = "Order_idOrder")
    @Id
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

        AnimatorHasOrderEntityPK that = (AnimatorHasOrderEntityPK) o;

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

    public AnimatorHasOrderEntityPK() {
    }

    public AnimatorHasOrderEntityPK(int animatorIdAnimator, int orderIdOrder) {
        this.animatorIdAnimator = animatorIdAnimator;
        this.orderIdOrder = orderIdOrder;
    }

    @Override
    public String toString() {
        return "AnimatorHasOrderEntityPK{" +
                "animatorIdAnimator=" + animatorIdAnimator +
                ", orderIdOrder=" + orderIdOrder +
                '}';
    }
}
