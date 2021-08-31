package com.example.TOM.BasicApp.Service.Users;

import com.example.TOM.BasicApp.Entity.Users;
import com.example.TOM.BasicApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.net.PasswordAuthentication;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void create(Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        usersRepository.save(users);

    }

    @Override
    public void update(Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        usersRepository.save(users);

    }

    @Override
    public void delete(Users users) {
        usersRepository.delete(users);

    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);

    }

    @Override
    public Optional<Users> read(Long id) {

        return usersRepository.findById(id);
    }

    @Override
    public List<Users> read() {
        return usersRepository.findAll();
    }



    //UserApplication Services










}
