package sushrut.springdipoc.springdi.services;

import sushrut.springdipoc.springdi.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
