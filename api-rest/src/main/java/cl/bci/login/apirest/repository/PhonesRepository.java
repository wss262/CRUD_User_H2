package cl.bci.login.apirest.repository;

import cl.bci.login.apirest.model.Phones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository("PhonesRepository")
public interface PhonesRepository extends JpaRepository<Phones, UUID> {
}
