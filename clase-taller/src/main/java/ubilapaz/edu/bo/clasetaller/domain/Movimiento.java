package ubilapaz.edu.bo.clasetaller.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movimiento")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    public int id;

    @Column(name="PRODUCTO")
    public String producto;

    @Column(name="PRECIO")
    public float precio;
    @Column(name="DESCUENTO")
    public float descuento;
    @Column(name="FECHA_REGISTRO")
    public LocalDateTime fecha_registro;
    @Column(name="FECHA_MODIFICACION")
    public LocalDateTime fecha_modificiacion;
}
