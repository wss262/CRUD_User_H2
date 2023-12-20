package cl.bci.login.apirest.service;

import cl.bci.login.apirest.model.Phones;
import cl.bci.login.apirest.repository.PhonesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class PhonesServiceImpl implements PhonesService {
    @Autowired
    private PhonesRepository phonesRepository;

    public Phones createPhones(Phones phones) {
        return phonesRepository.save(phones);
    }

    public void deletePhones(UUID id) {
        phonesRepository.deleteById(id);
    }

}
