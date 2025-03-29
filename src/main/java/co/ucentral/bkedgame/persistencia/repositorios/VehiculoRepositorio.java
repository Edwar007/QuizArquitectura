package co.ucentral.bkedgame.persistencia.repositorios;

import co.ucentral.bkedgame.persistencia.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {
}
