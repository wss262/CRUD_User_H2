package cl.bci.login.apirest.service;

import cl.bci.login.apirest.model.Phones;

import java.util.UUID;

public interface PhonesService {
    public Phones createPhones(Phones phones);

    public void deletePhones(UUID id);
}
