package com.example.TOM.BasicApp.Controller;

import com.example.TOM.BasicApp.Entity.Machine;
import com.example.TOM.BasicApp.Service.Machine.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/machine")
@CrossOrigin(origins = "*")
public class MachineController {

    @Autowired
    private MachineService machineService;


    @GetMapping(value = "/show")
    public List<Machine> getMachine() {

       return machineService.read();


    }

    @GetMapping(value = "/show/{id}")
    public Optional<Machine> getMachine(@PathVariable Long id) {

       return machineService.read(id);

    }

    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public void creatMachine(@RequestBody Machine machine){
        machineService.create(machine);

    }



    @DeleteMapping("/delete/{id}")
    public List<Machine> deleteMachine(@PathVariable long id) {
        machineService.delete(id);
        return getMachine();
    }

}
