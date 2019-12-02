package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.CostDaoImpl;
import ua.lviv.iot.model.CostEntity;
import ua.lviv.iot.model.CostEntityPK;
import org.hibernate.Session;

import java.util.List;

public class CostService {
    private Session session;

    public CostService(Session session) {
        this.session = session;
    }

    public List<CostEntity> findAll( )   {
        return new CostDaoImpl(this.session).findAll();
    }

    public CostEntity findById(CostEntityPK id)  {
        return new CostDaoImpl(this.session).findById(id);
    }

    public void create(CostEntity entity)  {
        new CostDaoImpl(this.session).persist(entity);
    }

    public void update(CostEntity entity )  {
        new CostDaoImpl(this.session).update(entity);
    }

    public void delete(CostEntityPK id)  {
        new CostDaoImpl(this.session).delete(id);
    }

}