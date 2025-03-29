package co.ucentral.bkedgame.controladores;

import co.ucentral.bkedgame.dto.VehiculoDTO;
import co.ucentral.bkedgame.servicios.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class VehiculosControlador {
    @Autowired
    VehiculoServicio vehiculoServicio;

    @PostMapping("/agregar-vehiculo")
    public void agregarVehiculo(@RequestBody VehiculoDTO vehiculoDTO){
        vehiculoServicio.agregarVehiculo(vehiculoDTO);
    }

    @GetMapping("/listar-vehiculo")
    public List<VehiculoDTO> listarVehiculos(){
        return  vehiculoServicio.listarVehiculos();
    }

}
