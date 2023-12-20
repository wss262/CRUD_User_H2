package cl.bci.login.apirest.controller;

import cl.bci.login.apirest.model.User;
import cl.bci.login.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsersAll() {
        return new ResponseEntity<>(userService.getUsersAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> searchUserById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @ResponseBody
    public void deleteUserById(@PathVariable("id") UUID id) {
        userService.deleteUser(id);
    }

}
