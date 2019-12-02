package ua.lviv.iot.dao.interfaces;
import java.sql.SQLException;
import java.util.List;

public interface GeneralDAO<T, ID> {
    public void persist(T entity);

    public void update(T entity);

    public T findById(ID id);

    public void delete(ID entity);

    public List<T> findAll();



}