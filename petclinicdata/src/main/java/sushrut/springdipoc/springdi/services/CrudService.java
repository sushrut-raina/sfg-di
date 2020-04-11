package sushrut.springdipoc.springdi.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID di);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
