package ua.lviv.iot.dao.implementation;
import ua.lviv.iot.dao.interfaces.AgencyDAO;
import org.hibernate.Session;
import ua.lviv.iot.model.AgencyEntity;

import java.util.List;

public class AgencyDaoImpl implements AgencyDAO {
    private Session session;

    public AgencyDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(AgencyEntity entity) {
        new Sessions().getCurrentSession().save(entity);
    }

    public void update(AgencyEntity entity) {
        new Sessions().getCurrentSession().update(entity);
    }

    public AgencyEntity findById(Integer id) {
        AgencyEntity agency = (AgencyEntity) new Sessions().getCurrentSession().get(AgencyEntity.class, id);
        return agency;
    }

    public void delete(Integer entity) {
        new Sessions().getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<AgencyEntity> findAll() {
        List<AgencyEntity> agency = (List<AgencyEntity>)session.createQuery("from AgencyEntity ").list();
        return agency;
    }


}