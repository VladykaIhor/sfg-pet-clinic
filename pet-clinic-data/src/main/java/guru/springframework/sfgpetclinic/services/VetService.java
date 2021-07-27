package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Vet findAll();
}
