package com.PrestamoBancarios.Prestamo.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

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
    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "pago_id", foreignKey = @ForeignKey(name = "FK_pago_id"))
    private Pago pago;

    public Prestamo(){}

    public Prestamo(Integer id, Double cantidadPrestamo, Double tasaInteresPrestamo, int plazoPagoPrestamo, int cuotasPagoPrestamo) {
        this.id = id;
        this.cantidadPrestamo = cantidadPrestamo;
        this.tasaInteresPrestamo = tasaInteresPrestamo;
        this.plazoPagoPrestamo = plazoPagoPrestamo;
        this.cuotasPagoPrestamo = cuotasPagoPrestamo;
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
}
