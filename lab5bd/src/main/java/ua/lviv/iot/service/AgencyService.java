package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.AgencyDaoImpl;
import ua.lviv.iot.model.AgencyEntity;
import org.hibernate.Session;

import java.util.List;

public class AgencyService {
    private Session session;

    public AgencyService(Session session) {
        this.session = session;
    }

    public List<AgencyEntity> findAll()   {
        return new AgencyDaoImpl(this.session).findAll();
    }

    public AgencyEntity findById(Integer id)  {
        return new AgencyDaoImpl(this.session).findById(id);
    }

    public void create(AgencyEntity entity)  {
        new AgencyDaoImpl(this.session).persist(entity);
    }

    public void update(AgencyEntity entity)  {
        new AgencyDaoImpl(this.session).update(entity);
    }

    public void delete(Integer id)  {
        new AgencyDaoImpl(this.session).delete(id);
    }
}
