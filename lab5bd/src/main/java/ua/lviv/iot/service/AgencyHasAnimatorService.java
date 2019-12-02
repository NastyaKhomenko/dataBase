package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.AgencyHasAnimatorDaoImpl;
import ua.lviv.iot.model.AgencyHasAnimatorEntity;
import ua.lviv.iot.model.AgencyHasAnimatorEntityPK;
import org.hibernate.Session;

import java.util.List;

public class AgencyHasAnimatorService {
    private Session session;

    public AgencyHasAnimatorService(Session session) {
        this.session = session;
    }

    public List<AgencyHasAnimatorEntity> findAll()   {
        return new AgencyHasAnimatorDaoImpl(this.session).findAll();
    }

    public AgencyHasAnimatorEntity findById(AgencyHasAnimatorEntityPK id)  {
        return new AgencyHasAnimatorDaoImpl(this.session).findById(id);
    }

    public void create(AgencyHasAnimatorEntity entity)  {
        new AgencyHasAnimatorDaoImpl(this.session).persist(entity);
    }

    public void update(AgencyHasAnimatorEntity entity)  {
        new AgencyHasAnimatorDaoImpl(this.session).update(entity);
    }

    public void delete(AgencyHasAnimatorEntityPK id)  {
        new AgencyHasAnimatorDaoImpl(this.session).delete(id);
    }

}