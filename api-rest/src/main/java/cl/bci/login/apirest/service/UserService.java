package cl.bci.login.apirest.service;

import cl.bci.login.apirest.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    public User createUser(User user);

    public User getUserById(UUID id);

    public List<User> getUsersAll();

    public void deleteUser(UUID id);
}
