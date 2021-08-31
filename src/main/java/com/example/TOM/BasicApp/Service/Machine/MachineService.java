package com.example.TOM.BasicApp.Service.Machine;

import com.example.TOM.BasicApp.Entity.Machine;


import java.util.List;
import java.util.Optional;

public interface MachineService {
    void create(Machine machine);

    void update(Machine machine);

    void delete(Machine machine);

    void delete(Long id);

    Optional<Machine> read(Long id);

    List<Machine> read();
}
