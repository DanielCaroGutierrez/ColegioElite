package com.example.ColegioElite.entidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.aop.framework.AopInfrastructureBean;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombres" , nullable = false, length = 50)
    private String nombre;

    @Column(name = "documento" , nullable = false, length = 20)
    private String documento;

    @Column(name = "correo" , nullable = false, length = 20)
    private String correo;

    @OneToOne (mappedBy = "estudiante", cascade = CascadeType.ALL)
    private Acudiente acudiente;
}
