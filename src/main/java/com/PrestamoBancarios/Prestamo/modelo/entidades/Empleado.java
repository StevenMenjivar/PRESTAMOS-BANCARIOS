package com.PrestamoBancarios.Prestamo.modelo.entidades;

import jakarta.persistence.*;

<<<<<<< HEAD
=======
import java.util.Objects;
>>>>>>> main
import java.util.Set;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    @Column(name = "apellido_empleado")
    private String apellidoEmpleado;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "empleado_sucursal",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id")
    )
    private Set<Sucursal> sucursals;



    public Set<Sucursal> getSucursals() {
        return sucursals;
    }

    public void setSucursals(Set<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }

    public Empleado(Integer id, String nombreEmpleado, String apellidoEmpleado) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public Empleado(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
<<<<<<< HEAD
=======

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombreEmpleado, empleado.nombreEmpleado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreEmpleado);
    }
>>>>>>> main
}
