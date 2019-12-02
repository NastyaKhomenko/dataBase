package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "order", schema = "animator", catalog = "")
@IdClass(OrderEntityPK.class)
public class OrderEntity {
    private Integer idOrder;
    private String date;
    private String time;
    private String typeOfHoliday;
    private Integer cost;
    private Integer amountOfAnimators;
    private Integer amountOfGuests;
    private String address;
    private String duration;
    private Integer customerIdCustomer;
    private Integer agencyIdAgency;

    @Id
    @Column(name = "idOrder")
    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "typeOfHoliday")
    public String getTypeOfHoliday() {
        return typeOfHoliday;
    }

    public void setTypeOfHoliday(String typeOfHoliday) {
        this.typeOfHoliday = typeOfHoliday;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "amountOfAnimators")
    public Integer getAmountOfAnimators() {
        return amountOfAnimators;
    }

    public void setAmountOfAnimators(int amountOfAnimators) {
        this.amountOfAnimators = amountOfAnimators;
    }

    @Basic
    @Column(name = "amountOfGuests")
    public Integer getAmountOfGuests() {
        return amountOfGuests;
    }

    public void setAmountOfGuests(int amountOfGuests) {
        this.amountOfGuests = amountOfGuests;
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
    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Id
    @Column(name = "Customer_idCustomer")
    public Integer getCustomerIdCustomer() {
        return customerIdCustomer;
    }

    public void setCustomerIdCustomer(int customerIdCustomer) {
        this.customerIdCustomer = customerIdCustomer;
    }

    @Id
    @Column(name = "Agency_idAgency")
    public Integer getAgencyIdAgency() {
        return agencyIdAgency;
    }

    public void setAgencyIdAgency(int agencyIdAgency) {
        this.agencyIdAgency = agencyIdAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (idOrder != that.idOrder) return false;
        if (cost != that.cost) return false;
        if (amountOfAnimators != that.amountOfAnimators) return false;
        if (amountOfGuests != that.amountOfGuests) return false;
        if (customerIdCustomer != that.customerIdCustomer) return false;
        if (agencyIdAgency != that.agencyIdAgency) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (typeOfHoliday != null ? !typeOfHoliday.equals(that.typeOfHoliday) : that.typeOfHoliday != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (typeOfHoliday != null ? typeOfHoliday.hashCode() : 0);
        result = 31 * result + cost;
        result = 31 * result + amountOfAnimators;
        result = 31 * result + amountOfGuests;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + customerIdCustomer;
        result = 31 * result + agencyIdAgency;
        return result;
    }

    public OrderEntity() {
    }

    public OrderEntity(Integer idOrder, String date, String time, String typeOfHoliday, Integer cost, Integer amountOfAnimators, Integer amountOfGuests, String address, String duration, Integer customerIdCustomer, Integer agencyIdAgency) {
        this.idOrder = idOrder;
        this.date = date;
        this.time = time;
        this.typeOfHoliday = typeOfHoliday;
        this.cost = cost;
        this.amountOfAnimators = amountOfAnimators;
        this.amountOfGuests = amountOfGuests;
        this.address = address;
        this.duration = duration;
        this.customerIdCustomer = customerIdCustomer;
        this.agencyIdAgency = agencyIdAgency;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "idOrder=" + idOrder +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", typeOfHoliday='" + typeOfHoliday + '\'' +
                ", cost=" + cost +
                ", amountOfAnimators=" + amountOfAnimators +
                ", amountOfGuests=" + amountOfGuests +
                ", address='" + address + '\'' +
                ", duration='" + duration + '\'' +
                ", customerIdCustomer=" + customerIdCustomer +
                ", agencyIdAgency=" + agencyIdAgency +
                '}';
    }
}
