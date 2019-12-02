package ua.lviv.iot.dao.implementation;

import ua.lviv.iot.model.AnimatorHasOrderEntity;
        import ua.lviv.iot.model.AnimatorHasOrderEntityPK;
        import org.hibernate.Session;
        import java.util.List;

public class AnimatorHasOrderDaoImpl {
    private Session session;

    public AnimatorHasOrderDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(AnimatorHasOrderEntity entity) {
        session.save(entity);
    }

    public void update(AnimatorHasOrderEntity entity) {
        session.update(entity);
    }

    public AnimatorHasOrderEntity findById(AnimatorHasOrderEntityPK id) {
        AnimatorHasOrderEntity animatorHasOrder = (AnimatorHasOrderEntity)session.get(AnimatorHasOrderEntity.class, id);
        return animatorHasOrder;
    }

    public void delete(AnimatorHasOrderEntityPK entity){session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<AnimatorHasOrderEntity> findAll() {
        List<AnimatorHasOrderEntity> animatorHasOrder = (List<AnimatorHasOrderEntity>) session.createQuery("from AnimatorHasOrderEntity ").list();
        return animatorHasOrder;
    }


}