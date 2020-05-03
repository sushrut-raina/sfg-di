package sushrut.springdipoc.springdi.services.map;

import org.springframework.stereotype.Service;
import sushrut.springdipoc.springdi.model.Speciality;
import sushrut.springdipoc.springdi.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long di) {
        return super.findById(di);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
