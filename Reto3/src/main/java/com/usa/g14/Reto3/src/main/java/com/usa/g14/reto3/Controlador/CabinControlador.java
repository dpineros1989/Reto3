package com.usa.g14.reto3.Controlador;

import com.usa.g14.reto3.Modelo.Cabin;
import com.usa.g14.reto3.Servicio.CabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(" /Cabin")
public class CabinControlador {

    @Autowired
    private CabinService cabinService;

    @GetMapping("/all")
    public List<Cabin> getALL(){
        return cabinService.getAll();
    }

    @PostMapping("/save")
    public Cabin save(@RequestBody Cabin p){
        return cabinService.save(p);

    }
}
