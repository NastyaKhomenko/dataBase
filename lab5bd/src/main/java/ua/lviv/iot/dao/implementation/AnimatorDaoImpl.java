package ua.lviv.iot.dao.implementation;

import ua.lviv.iot.dao.interfaces.AnimatorDAO;
import ua.lviv.iot.model.AnimatorEntity;
import org.hibernate.Session;

import java.util.List;

public class AnimatorDaoImpl implements AnimatorDAO {
    private Session session;

    public AnimatorDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(AnimatorEntity entity) {
        new Sessions().getCurrentSession().save(entity);
    }

    public void update(AnimatorEntity entity) {
        new Sessions().getCurrentSession().update(entity);
    }

    public AnimatorEntity findById(Integer id) {
        AnimatorEntity animator = (AnimatorEntity) new Sessions().getCurrentSession().get(AnimatorEntity.class, id);
        return animator;
    }

    public void delete(Integer entity) {
        new Sessions().getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<AnimatorEntity> findAll() {
        List<AnimatorEntity> animator = (List<AnimatorEntity>)session.createQuery("from AnimatorEntity ").list();
        return animator;
    }


}