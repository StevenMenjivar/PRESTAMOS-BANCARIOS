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


    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "garantia_id", foreignKey = @ForeignKey(name = "FK_garantia_id"))
    private Garantia garantia;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "cliente_id", foreignKey = @ForeignKey(name = "FK_cliente_id"))
    private Cliente cliente;

    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "empleado_id", foreignKey = @ForeignKey(name = "FK_empleado_id"))
    private Empleado empleado;


    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}) @JoinColumn(name = "tipoprestamo_id", foreignKey = @ForeignKey(name = "FK_tipoprestamo_id"))
    private TipoPrestamo tipoPrestamo;

    @OneToOne(optional = true, cascade = CascadeType.ALL) @JoinColumn(name = "fiador_id", foreignKey = @ForeignKey(name = "FK_fiador_ID"))
    private Fiador fiador;
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
