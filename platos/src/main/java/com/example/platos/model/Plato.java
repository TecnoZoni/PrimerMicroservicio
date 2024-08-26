package com.example.platos.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlato;
    private String nombrePlato;
    private double precio;
    private String descripcion;
    //la lista de ingredientes es únicamente de los nombres de los mismos
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> listaIngredientes;
}
