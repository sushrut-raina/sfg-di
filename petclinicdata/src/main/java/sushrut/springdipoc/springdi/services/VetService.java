package sushrut.springdipoc.springdi.services;

import sushrut.springdipoc.springdi.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById();

    Vet save(Vet vet);

    Set<Vet> findAll();
}
