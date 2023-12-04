package com.PrestamoBancarios.Prestamo.repositorios;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Prestamo;
import org.springframework.data.repository.CrudRepository;

public interface PrestamoRepository extends CrudRepository<Prestamo, Integer> {
    // Iterable<Prestamo> findPrestamoByClienteContainsIgnoreCase (Cliente cliente);
    Iterable<Prestamo> findPrestamoByTasaInteresPrestamoAfter(Double tasaInteresPrestamo);
    Iterable<Prestamo> findPrestamoByCuotasPagoPrestamoLike(Integer cuotasPagoPrestamo);
}
