package ua.lviv.iot.dao.implementation;
import ua.lviv.iot.dao.interfaces.OrderDAO;
import ua.lviv.iot.model.OrderEntity;
import ua.lviv.iot.model.OrderEntityPK;
import org.hibernate.Session;
import java.util.List;


public class OrderDaoImpl implements OrderDAO {
    private Session session;

    public OrderDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(OrderEntity entity) {
        session.save(entity);
    }

    public void update(OrderEntity entity) {
        session.update(entity);
    }

    public OrderEntity findById(OrderEntityPK id) {
        OrderEntity order= (OrderEntity) session.get(OrderEntity.class, id);
        return order;
    }

    public void delete(OrderEntityPK entity) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<OrderEntity> findAll() {
        List<OrderEntity> order = (List<OrderEntity>) session.createQuery("from OrderEntity ").list();
        return order;
    }



}