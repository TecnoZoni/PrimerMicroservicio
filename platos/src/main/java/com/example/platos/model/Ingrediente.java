package com.example.platos.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Ingrediente {

    private Long id_ingrediente;
    private String nombre_ingrediente;
    private List<Plato> lista_platos;
}
