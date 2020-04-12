package sushrut.springdipoc.springdi.services.map;

import sushrut.springdipoc.springdi.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        Long id = getNextId();
        if (!Objects.isNull(object)) {
            if (Objects.isNull(object.getId())) {
                object.setId(id);
                map.put(id, object);
            } else map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object can not be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entryVal -> entryVal.getValue().equals(object));
    }

    private Long getNextId() {
        return map.isEmpty() ? 0 : ((Collections.max(map.keySet())) + 1L);
    }
}
