package ua.lviv.iot.dao.implementation;

import ua.lviv.iot.model.AgencyHasAnimatorEntity;
        import ua.lviv.iot.model.AgencyHasAnimatorEntityPK;
        import org.hibernate.Session;
        import java.util.List;

public class AgencyHasAnimatorDaoImpl {
    private Session session;

    public AgencyHasAnimatorDaoImpl(Session session) {
        this.session = session;
    }

    public void persist(AgencyHasAnimatorEntity entity) {
        session.save(entity);
    }

    public void update(AgencyHasAnimatorEntity entity) {
        session.update(entity);
    }

    public AgencyHasAnimatorEntity findById(AgencyHasAnimatorEntityPK id) {
        AgencyHasAnimatorEntity agencyHasAnimator = (AgencyHasAnimatorEntity)session.get(AgencyHasAnimatorEntity.class, id);
        return agencyHasAnimator;
    }

    public void delete(AgencyHasAnimatorEntityPK entity){session.delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<AgencyHasAnimatorEntity> findAll() {
        List<AgencyHasAnimatorEntity> agencyHasAnimator = (List<AgencyHasAnimatorEntity>) session.createQuery("from AgencyHasAnimatorEntity ").list();
        return agencyHasAnimator;
    }


}