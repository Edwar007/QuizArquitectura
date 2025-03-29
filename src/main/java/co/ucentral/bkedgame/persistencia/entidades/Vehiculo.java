package co.ucentral.bkedgame.persistencia.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "color")
    private String color;

    @Column(name = "marca")
    private String marca;

    @Column(name = "fecRegistro")
    private LocalDate fecRegistro;
}
