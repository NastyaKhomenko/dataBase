package ua.lviv.iot.dao.implementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Sessions {
    private static SessionFactory ourSessionFactory;
    static {
        try { // Create the SessionFactory from hibernate.cfg.xml


                ourSessionFactory = new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    private  Session currentSession;
    private  Transaction currentTransaction;
    public  Session openCurrentSession() {
        currentSession = ourSessionFactory.openSession();
        return currentSession;
    }

    public  Session openCurrentSessionWithTransaction() {
try {
    currentSession = ourSessionFactory.openSession();
    currentTransaction = currentSession.beginTransaction();
}catch (Exception e){
     System.out.println(e);
        }



        return currentSession;

    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public  void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private  SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = (SessionFactory) configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }


    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

}
