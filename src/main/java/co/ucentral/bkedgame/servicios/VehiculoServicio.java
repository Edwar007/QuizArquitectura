package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.dto.VehiculoDTO;
import co.ucentral.bkedgame.persistencia.entidades.Vehiculo;
import co.ucentral.bkedgame.persistencia.repositorios.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class VehiculoServicio {
    @Autowired
    VehiculoRepositorio vehiculoRepositorio;

    public void agregarVehiculo(VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = Vehiculo.builder()
                .placa(vehiculoDTO.getPlaca())
                .modelo(vehiculoDTO.getModelo())
                .color(vehiculoDTO.getColor())
                .marca(vehiculoDTO.getMarca())
                .fecRegistro(vehiculoDTO.getFecRegistro())
                .build();
        vehiculoRepositorio.save(vehiculo);
    }
}
