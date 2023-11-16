package com.PrestamoBancarios.Prestamo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoempleados")
public class TipoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descripcion")
    private String descripcion;

    public TipoEmpleado(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
