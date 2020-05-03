package sushrut.springdipoc.springdi.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sushrut.springdipoc.springdi.model.Owner;
import sushrut.springdipoc.springdi.model.Pet;
import sushrut.springdipoc.springdi.model.PetType;
import sushrut.springdipoc.springdi.model.Vet;
import sushrut.springdipoc.springdi.services.OwnerService;
import sushrut.springdipoc.springdi.services.PetService;
import sushrut.springdipoc.springdi.services.PetTypeService;
import sushrut.springdipoc.springdi.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {


        PetType dog = new PetType();
        dog.setName("Tommy");
        PetType cat = new PetType();
        cat.setName("meow");


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Flat no 1, neha building");
        owner1.setCity("Pune");
        owner1.setTelephone("9881653620");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(petTypeService.save(dog));
        mikesPet.setPetOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPet().add(mikesPet);
        petService.save(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("Flat no 1, neha building");
        owner2.setCity("Pune");
        owner2.setTelephone("9881653620");
        Pet fionasCat = new Pet();
        fionasCat.setPetType(petTypeService.save(cat));
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetOwner(owner2);
        owner2.getPet().add(fionasCat);
        petService.save(fionasCat);
        ownerService.save(owner2);


        System.out.println("Loaded owners.....");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");


    }

}
