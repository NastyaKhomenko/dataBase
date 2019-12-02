package ua.lviv.iot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrderEntityPK implements Serializable {
    private int idOrder;
    private int customerIdCustomer;
    private int agencyIdAgency;

    @Column(name = "idOrder")
    @Id
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Column(name = "Customer_idCustomer")
    @Id
    public int getCustomerIdCustomer() {
        return customerIdCustomer;
    }

    public void setCustomerIdCustomer(int customerIdCustomer) {
        this.customerIdCustomer = customerIdCustomer;
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

        OrderEntityPK that = (OrderEntityPK) o;

        if (idOrder != that.idOrder) return false;
        if (customerIdCustomer != that.customerIdCustomer) return false;
        if (agencyIdAgency != that.agencyIdAgency) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + customerIdCustomer;
        result = 31 * result + agencyIdAgency;
        return result;
    }

    public OrderEntityPK() {
    }

    public OrderEntityPK(int idOrder, int customerIdCustomer, int agencyIdAgency) {
        this.idOrder = idOrder;
        this.customerIdCustomer = customerIdCustomer;
        this.agencyIdAgency = agencyIdAgency;
    }

    @Override
    public String toString() {
        return "OrderEntityPK{" +
                "idOrder=" + idOrder +
                ", customerIdCustomer=" + customerIdCustomer +
                ", agencyIdAgency=" + agencyIdAgency +
                '}';
    }
}
