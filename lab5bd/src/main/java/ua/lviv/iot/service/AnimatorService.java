package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.AnimatorDaoImpl;
import ua.lviv.iot.model.AnimatorEntity;
import org.hibernate.Session;

import java.util.List;

public class AnimatorService {
    private Session session;

    public AnimatorService(Session session) {
        this.session = session;
    }

    public List<AnimatorEntity> findAll()   {
        return new AnimatorDaoImpl(this.session).findAll();
    }

    public AnimatorEntity findById(Integer id)  {
        return new AnimatorDaoImpl(this.session).findById(id);
    }

    public void create(AnimatorEntity entity)  {
        new AnimatorDaoImpl(this.session).persist(entity);
    }

    public void update(AnimatorEntity entity)  {
        new AnimatorDaoImpl(this.session).update(entity);
    }

    public void delete(Integer id)  {
        new AnimatorDaoImpl(this.session).delete(id);
    }
}

