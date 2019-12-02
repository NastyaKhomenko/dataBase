package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.CustomerDaoImpl;
import ua.lviv.iot.model.CustomerEntity;
import org.hibernate.Session;

import java.util.List;

public class CustomerService {
    private Session session;

    public CustomerService(Session session) {
        this.session = session;
    }

    public List<CustomerEntity> findAll()   {
        return new CustomerDaoImpl(this.session).findAll();
    }

    public CustomerEntity findById(Integer id)  {
        return new CustomerDaoImpl(this.session).findById(id);
    }

    public void create(CustomerEntity entity)  {
        new CustomerDaoImpl(this.session).persist(entity);
    }

    public void update(CustomerEntity entity)  {
        new CustomerDaoImpl(this.session).update(entity);
    }

    public void delete(Integer id)  {
        new CustomerDaoImpl(this.session).delete(id);
    }
}

