package com.PrestamoBancarios.Prestamo.modelo.entidades;

import jakarta.persistence.*;

<<<<<<< HEAD
=======
import java.util.Objects;
>>>>>>> main
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nmbre_cliente")
    private String nombreCliente;

    @Column(name = "apellido_cliente")
    private String apellidoCliente;

    @Column(name = "edad_cliente")
    private int edadCliente;

    @Column(name = "dui_cliente")
    private String duiCliente;

    @Column(name = "sueldo_liquido_cliente")
    private Double sueldoLiquidoCliente;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "cliente_tipoCliente",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "tipo_cliente_id")
    )
    private Set<TipoCliente> tipoClientes;

    public Cliente(){}

    public Cliente(Integer id, String nombreCliente, String apellidoCliente, int edadCliente, String duiCliente, Double sueldoLiquidoCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.edadCliente = edadCliente;
        this.duiCliente = duiCliente;
        this.sueldoLiquidoCliente = sueldoLiquidoCliente;
    }

<<<<<<< HEAD
=======
    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

>>>>>>> main
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getDuiCliente() {
        return duiCliente;
    }

    public void setDuiCliente(String duiCliente) {
        this.duiCliente = duiCliente;
    }

    public Double getSueldoLiquidoCliente() {
        return sueldoLiquidoCliente;
    }

    public void setSueldoLiquidoCliente(Double sueldoLiquidoCliente) {
        this.sueldoLiquidoCliente = sueldoLiquidoCliente;
    }

<<<<<<< HEAD


=======
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombreCliente, cliente.nombreCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCliente);
    }
>>>>>>> main
}
