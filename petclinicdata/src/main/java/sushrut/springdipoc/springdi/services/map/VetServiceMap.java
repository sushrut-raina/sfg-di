package sushrut.springdipoc.springdi.services.map;

import org.springframework.stereotype.Service;
import sushrut.springdipoc.springdi.model.Vet;
import sushrut.springdipoc.springdi.services.CrudService;
import sushrut.springdipoc.springdi.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long di) {
        return super.findById(di);
    }
}
