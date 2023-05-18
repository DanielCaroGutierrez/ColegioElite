package com.example.ColegioElite.entidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column(name = "nombres" , nullable = false, length = 50)
    private String nombre;

    @Column(name = "numeroCreditos" , nullable = false)
    private Integer numeroCreditos;
}
