package com.PrestamoBancarios.Prestamo.modelo.entidades;


import com.PrestamoBancarios.Prestamo.modelo.entidades.Prestamo;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "prestamos")
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad_prestamos")
    private Double cantidadPrestamo;

    @Column(name = "tasa_interes_prestamos")
    private Double tasaInteresPrestamo;

    @Column(name = "plazo_pago_prestamos")
    private int plazoPagoPrestamo;

    @Column(name = "cuota_pago_prestamo")
    private int cuotasPagoPrestamo;

    public Prestamo prestamo;


    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "garantia_id", foreignKey = @ForeignKey(name = "FK_garantia_id"))
    private Garantia garantia;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "cliente_id", foreignKey = @ForeignKey(name = "FK_cliente_id"))
    private Cliente cliente;



    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "tipoprestamo_id", foreignKey = @ForeignKey(name = "FK_tipoprestamo_id"))
    private TipoPrestamo tipoPrestamo;

    @OneToOne(optional = true, cascade = CascadeType.ALL) @JoinColumn(name = "fiador_id", foreignKey = @ForeignKey(name = "FK_fiador_ID"))
    private Fiador fiador;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "prestamo_empleados",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "prestamo_id")
    )
    private Set<Empleado> empleados;





    public Prestamo(){}

    public Prestamo(Integer id, Cliente cliente, Double cantidadPrestamo, Double tasaInteresPrestamo, int plazoPagoPrestamo, int cuotasPagoPrestamo) {
        this.id = id;
        this.cantidadPrestamo = cantidadPrestamo;
        this.tasaInteresPrestamo = tasaInteresPrestamo;
        this.plazoPagoPrestamo = plazoPagoPrestamo;
        this.cuotasPagoPrestamo = cuotasPagoPrestamo;
        this.cliente=cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(Double cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public Double getTasaInteresPrestamo() {
        return tasaInteresPrestamo;
    }

    public void setTasaInteresPrestamo(Double tasaInteresPrestamo) {
        this.tasaInteresPrestamo = tasaInteresPrestamo;
    }

    public int getPlazoPagoPrestamo() {
        return plazoPagoPrestamo;
    }

    public void setPlazoPagoPrestamo(int plazoPagoPrestamo) {
        this.plazoPagoPrestamo = plazoPagoPrestamo;
    }

    public int getCuotasPagoPrestamo() {
        return cuotasPagoPrestamo;
    }

    public void setCuotasPagoPrestamo(int cuotasPagoPrestamo) {
        this.cuotasPagoPrestamo = cuotasPagoPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }



    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }


    public Fiador getFiador() {
        return fiador;
    }

    public void setFiador(Fiador fiador) {
        this.fiador = fiador;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return cuotasPagoPrestamo == prestamo.cuotasPagoPrestamo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuotasPagoPrestamo);
    }
}
