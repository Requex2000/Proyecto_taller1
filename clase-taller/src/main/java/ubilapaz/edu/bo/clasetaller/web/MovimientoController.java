package ubilapaz.edu.bo.clasetaller.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ubilapaz.edu.bo.clasetaller.domain.Movimiento;
import ubilapaz.edu.bo.clasetaller.domain.User;
import ubilapaz.edu.bo.clasetaller.dto.MovimientoDto;
import ubilapaz.edu.bo.clasetaller.dto.UserDto;
import ubilapaz.edu.bo.clasetaller.dto.UsuarioDto;
import ubilapaz.edu.bo.clasetaller.persistence.MovimientoRepository;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/movimiento")
public class MovimientoController {
    @Autowired
    private MovimientoRepository movimientoRepository;
    @PostMapping("/create")
    public ResponseEntity<String> registrar(@RequestBody MovimientoDto movimientoDto) {
        String mensaje = "Registro exitoso";
        try {
            Movimiento movimiento = new Movimiento();

            movimiento.setProducto(movimiento.producto);
            movimiento.setPrecio(movimiento.precio);
            movimiento.setDescuento(movimiento.descuento);
            if (movimiento.producto.substring(0,0) =="P") {
                movimiento.setPrecio(movimiento.getPrecio()*movimiento.descuento);
            }

            //MovimientoRepository.save(movimiento);

        } catch (Exception e) {
            mensaje = "Algo salio mal";
        }
        return new ResponseEntity<String>(mensaje, HttpStatus.OK);
    }

   @GetMapping("/list")
    public ResponseEntity<List<Movimiento>> reporte(){
        List<Movimiento> movimientoList =  movimientoRepository.findAll();
        return new ResponseEntity<List<Movimiento>>(movimientoList, HttpStatus.OK);
    }



    }
