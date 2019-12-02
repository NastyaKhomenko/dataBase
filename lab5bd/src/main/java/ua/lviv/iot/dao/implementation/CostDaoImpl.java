package ua.lviv.iot.dao.implementation;
import ua.lviv.iot.dao.interfaces.CostDAO;
import ua.lviv.iot.model.CostEntity;
import ua.lviv.iot.model.CostEntityPK;
import org.hibernate.Session;
import java.util.List;


public class CostDaoImpl implements CostDAO {
    private Session session;

    public CostDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(CostEntity entity) {
        session.save(entity);
    }

    public void update(CostEntity entity) {
        session.update(entity);
    }

    public CostEntity findById(CostEntityPK id) {
        CostEntity cost= (CostEntity) session.get(CostEntity.class, id);
        return cost;
    }

    public void delete(CostEntityPK entity) {
        session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<CostEntity> findAll() {
        List<CostEntity> cost = (List<CostEntity>) session.createQuery("from CostEntity ").list();
        return cost;
    }



}