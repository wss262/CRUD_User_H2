package cl.bci.login.apirest.service;

import cl.bci.login.apirest.model.Phones;
import cl.bci.login.apirest.model.User;
import cl.bci.login.apirest.repository.PhonesRepository;
import cl.bci.login.apirest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(UUID id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    public List<User> getUsersAll() {
        return userRepository.findAll();
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

}


