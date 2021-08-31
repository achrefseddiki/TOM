package com.example.TOM.BasicApp.Repository;

import com.example.TOM.BasicApp.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    public Users getUsersByUsername(String username);
}
