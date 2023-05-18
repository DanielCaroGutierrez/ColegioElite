package com.example.ColegioElite.entidad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    private Integer id;
    private String nombre;
    private Integer escalafon;
}
