package com.PrestamoBancarios.Prestamo.Modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "garantias")
public class Garantia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descripcion_garantia")
    private String descripcionGarantia;

    public Garantia(){}

    public Garantia(Integer id, String descripcionGarantia) {
        this.id = id;
        this.descripcionGarantia = descripcionGarantia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcionGarantia() {
        return descripcionGarantia;
    }

    public void setDescripcionGarantia(String descripcionGarantia) {
        this.descripcionGarantia = descripcionGarantia;
    }
}
