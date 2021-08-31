package com.example.TOM.BasicApp.Repository;

import com.example.TOM.BasicApp.Entity.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Machine,Long> {
}
