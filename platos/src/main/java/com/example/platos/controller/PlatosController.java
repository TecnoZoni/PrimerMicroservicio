package com.example.platos.controller;

import com.example.platos.dto.PlatoDTO;
import com.example.platos.model.Plato;
import com.example.platos.service.IPlatoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platos")
public class PlatosController {

    @Autowired
    private IPlatoService platoServ;

    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody PlatoDTO plato) {
        platoServ.savePlato(plato.getNombrePlato(), plato.getPrecio(), plato.getDescripcion());
        return "Plato guardado correctamente";
    }

    @GetMapping("/traer")
    public List<Plato> traerPlatos() {
        return platoServ.getPlatos();
    }
}
