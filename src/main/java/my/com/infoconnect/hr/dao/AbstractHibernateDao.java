package my.com.infoconnect.hr.dao;

import java.io.Serializable;
import java.util.List;

public interface AbstractHibernateDao<T extends Serializable> {

    T findOne(final long id);

    T findOne(String field, String id);

    List<T> findAll();

    List<T> findAll(String sort);

    void save(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long entityId);
}
