package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.dto.VehiculoDTO;
import co.ucentral.bkedgame.servicios.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipos")
public class VehiculosControlador {
    @Autowired
    VehiculoServicio vehiculoServicio;

    @PostMapping("/agregar-vehiculo")
    public void agregarVehiculo(@RequestBody VehiculoDTO vehiculoDTO){
        vehiculoServicio.agregarVehiculo(vehiculoDTO);
    }


}
