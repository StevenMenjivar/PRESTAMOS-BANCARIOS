package com.PrestamoBancarios.Prestamo.Entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigoEmpleado;
    private String nombre;
    private String apellido;
    private Sucursal sucursal;
    //CONSTRUCTORES
    public Empleado() {
    }

    public Empleado(Integer id, String codigoEmpleado, String nombre, String apellido, Sucursal sucursal) {
        this.id = id;
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sucursal=sucursal;
    }
    //GET Y SET


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sucursal=" + sucursal +
                '}';
    }
}
