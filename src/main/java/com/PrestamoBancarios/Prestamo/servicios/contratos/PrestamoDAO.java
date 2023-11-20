package com.PrestamoBancarios.Prestamo.servicios.contratos;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Prestamo;

import java.util.Optional;

public interface PrestamoDAO {

    Optional<Prestamo> findById(Integer id);
    Prestamo save (Prestamo prestamo);
    Iterable<Prestamo> findAll();
    void deleteById(Integer id);

}
