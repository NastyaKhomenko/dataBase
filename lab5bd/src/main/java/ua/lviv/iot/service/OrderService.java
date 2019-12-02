package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.OrderDaoImpl;
import ua.lviv.iot.model.OrderEntity;
import ua.lviv.iot.model.OrderEntityPK;
import org.hibernate.Session;

import java.util.List;

public class OrderService {
    private Session session;

    public OrderService(Session session) {
        this.session = session;
    }

    public List<OrderEntity> findAll( )   {
        return new OrderDaoImpl(this.session).findAll();
    }

    public OrderEntity findById(OrderEntityPK id)  {
        return new OrderDaoImpl(this.session).findById(id);
    }

    public void create(OrderEntity entity)  {
        new OrderDaoImpl(this.session).persist(entity);
    }

    public void update(OrderEntity entity )  {
        new OrderDaoImpl(this.session).update(entity);
    }

    public void delete(OrderEntityPK id)  {
        new OrderDaoImpl(this.session).delete(id);
    }

}