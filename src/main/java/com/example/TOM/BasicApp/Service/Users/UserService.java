package com.example.TOM.BasicApp.Service.Users;

import com.example.TOM.BasicApp.Entity.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void create(Users users);

    void update(Users users);

    void delete(Users users);

    void delete(Long id);

    Optional<Users> read(Long id);

    List<Users> read();
}
