package ua.lviv.iot.service;

import ua.lviv.iot.dao.implementation.AnimatorHasOrderDaoImpl;
        import ua.lviv.iot.model.AnimatorHasOrderEntity;
        import ua.lviv.iot.model.AnimatorHasOrderEntityPK;
        import org.hibernate.Session;

        import java.util.List;

public class AnimatorHasOrderService {
    private Session session;

    public AnimatorHasOrderService(Session session) {
        this.session = session;
    }

    public List<AnimatorHasOrderEntity> findAll()   {
        return new AnimatorHasOrderDaoImpl(this.session).findAll();
    }

    public AnimatorHasOrderEntity findById(AnimatorHasOrderEntityPK id)  {
        return new AnimatorHasOrderDaoImpl(this.session).findById(id);
    }

    public void create(AnimatorHasOrderEntity entity)  {
        new AnimatorHasOrderDaoImpl(this.session).persist(entity);
    }

    public void update(AnimatorHasOrderEntity entity)  {
        new AnimatorHasOrderDaoImpl(this.session).update(entity);
    }

    public void delete(AnimatorHasOrderEntityPK id)  {
        new AnimatorHasOrderDaoImpl(this.session).delete(id);
    }

}