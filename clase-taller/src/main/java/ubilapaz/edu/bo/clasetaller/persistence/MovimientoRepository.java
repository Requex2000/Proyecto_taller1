package ubilapaz.edu.bo.clasetaller.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ubilapaz.edu.bo.clasetaller.domain.Movimiento;
import ubilapaz.edu.bo.clasetaller.domain.User;
import ubilapaz.edu.bo.clasetaller.dto.MovimientoDto;
import ubilapaz.edu.bo.clasetaller.dto.UserDto;

import java.util.List;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento,Integer> {

   /* @Query(value = "select new ubilapaz.edu.bo.clasetaller.dto.MovimientoDto(m.producto,m.precio,m.descuento,m.fecha_registro,m.fecha_modificacion) from movimiento m order by m.id")
    List<MovimientoDto> movimientoList();
*/



}
