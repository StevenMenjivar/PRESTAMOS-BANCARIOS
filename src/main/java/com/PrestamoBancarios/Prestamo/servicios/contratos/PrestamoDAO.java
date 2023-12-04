package com.PrestamoBancarios.Prestamo.servicios.contratos;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Prestamo;

public interface PrestamoDAO extends GenericoDAO<Prestamo>{
    //   Iterable<Prestamo> findPrestamoByClienteContainsIgnoreCase (Cliente cliente);
    Iterable<Prestamo> findPrestamoByTasaInteresPrestamoAfter(Double tasaInteresPrestamo);
    Iterable<Prestamo> findPrestamoByCuotasPagoPrestamoLike(Integer cuotasPagoPrestamo);
}
