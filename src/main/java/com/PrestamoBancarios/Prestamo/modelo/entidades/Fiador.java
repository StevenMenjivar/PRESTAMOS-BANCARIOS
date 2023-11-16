package com.PrestamoBancarios.Prestamo.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "fiadores")
public class Fiador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_fiador")
    private String nombreFiador;

    @Column(name = "apellido_fiador")
    private String apellidoFiador;

    @Column(name = "dui_fiador")
    private char duiFiador;

    public Fiador(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreFiador() {
        return nombreFiador;
    }

    public void setNombreFiador(String nombreFiador) {
        this.nombreFiador = nombreFiador;
    }

    public String getApellidoFiador() {
        return apellidoFiador;
    }

    public void setApellidoFiador(String apellidoFiador) {
        this.apellidoFiador = apellidoFiador;
    }

    public char getDuiFiador() {
        return duiFiador;
    }

    public void setDuiFiador(char duiFiador) {
        this.duiFiador = duiFiador;
    }
}
