package ao.morgado.bootstrapper.db;

import java.util.List;

public interface Repository<T, ID> {

    T findById(ID id);
    List<T> fetchAll();
    T save(T entity);
    void deleteById(ID id);
}