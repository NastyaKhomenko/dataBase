package ua.lviv.iot.dao.implementation;

import ua.lviv.iot.dao.interfaces.CustomerDAO;
        import ua.lviv.iot.model.CustomerEntity;
        import org.hibernate.Session;

        import java.util.List;

public class CustomerDaoImpl implements CustomerDAO {
    private Session session;

    public CustomerDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(CustomerEntity entity) {
        new Sessions().getCurrentSession().save(entity);
    }

    public void update(CustomerEntity entity) {
        new Sessions().getCurrentSession().update(entity);
    }

    public CustomerEntity findById(Integer id) {
        CustomerEntity customer = (CustomerEntity) new Sessions().getCurrentSession().get(CustomerEntity.class, id);
        return customer;
    }

    public void delete(Integer entity) {
        new Sessions().getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<CustomerEntity> findAll() {
        List<CustomerEntity> customer = (List<CustomerEntity>)session.createQuery("from CustomerEntity ").list();
        return customer;
    }


}