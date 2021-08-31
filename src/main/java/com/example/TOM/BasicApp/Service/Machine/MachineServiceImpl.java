package com.example.TOM.BasicApp.Service.Machine;

import com.example.TOM.BasicApp.Entity.Machine;
import com.example.TOM.BasicApp.Repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MachineServiceImpl implements MachineService{

    @Autowired
    private MachineRepository machineRepository;

    @Override
    public void create(Machine machine) {
        machineRepository.save(machine);
    }

    @Override
    public void update(Machine machine) {
        machineRepository.save(machine);

    }

    @Override
    public void delete(Machine machine) {
        machineRepository.delete(machine);

    }

    @Override
    public void delete(Long id) {
        machineRepository.deleteById(id);

    }

    @Override
    public Optional<Machine> read(Long id) {
        return machineRepository.findById(id);
    }

    @Override
    public List<Machine> read() {
        return machineRepository.findAll();
    }
}
