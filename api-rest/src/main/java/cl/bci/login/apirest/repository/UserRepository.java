package cl.bci.login.apirest.repository;

import cl.bci.login.apirest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, UUID> {

}
