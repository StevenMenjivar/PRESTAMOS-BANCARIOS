<<<<<<< HEAD
package com.PrestamoBancarios.Prestamo.modelo.entidades;
=======
package com.PrestamoBancarios.Prestamo.Modelo.entidades;
>>>>>>> main

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrestamo")
public class TipoPrestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion")
    private String descripcion_tipo_prestamo;

    public TipoPrestamo (){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion_tipo_prestamo() {
        return descripcion_tipo_prestamo;
    }

    public void setDescripcion_tipo_prestamo(String descripcion_tipo_prestamo) {
        this.descripcion_tipo_prestamo = descripcion_tipo_prestamo;
    }
}
