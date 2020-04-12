package sushrut.springdipoc.springdi.services.map;

import org.springframework.stereotype.Service;
import sushrut.springdipoc.springdi.model.Pet;
import sushrut.springdipoc.springdi.services.CrudService;
import sushrut.springdipoc.springdi.services.PetService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long di) {
        return super.findById(di);
    }
}
