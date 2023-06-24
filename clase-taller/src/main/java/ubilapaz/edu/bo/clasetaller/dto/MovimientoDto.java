package ubilapaz.edu.bo.clasetaller.dto;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.Date;

public class MovimientoDto {

    public  int id;
    public String producto;
    public  float precio;
    public   float descuento;

    public LocalDate fecha_registro;

    public LocalDate fecha_modificiacion;
}
