package com.example.TOM.BasicApp.Controller;


import com.example.TOM.BasicApp.Entity.Users;
import com.example.TOM.BasicApp.Service.Users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UsersController {
    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/show")
    public List<Users> getUsers() {

        List<Users> users = userService.read();

        return users;
    }

    @GetMapping(value = "/show/{id}")
    public Optional<Users> getUser(@PathVariable Long id) {

        Optional<Users> community = userService.read(id);

        return community;
    }

    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public void creatUsers(@RequestBody Users users){

    userService.create(users);

    }



    @DeleteMapping("/delete/{id}")
    public List<Users> deleteUser(@PathVariable long id) {
        userService.delete(id);
        return getUsers();
    }



}
