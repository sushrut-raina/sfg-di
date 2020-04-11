package sushrut.springdipoc.springdi.services;

import sushrut.springdipoc.springdi.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
