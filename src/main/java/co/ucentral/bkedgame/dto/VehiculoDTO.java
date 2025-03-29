package co.ucentral.bkedgame.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class VehiculoDTO {
    private String placa;
    private String modelo;
    private String color;
    private String marca;
    private LocalDate fecRegistro;
}
