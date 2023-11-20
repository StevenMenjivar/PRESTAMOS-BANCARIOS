package com.PrestamoBancarios.Prestamo.servicios.contratos;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Cliente;

import java.util.Optional;

public interface ClienteDAO {

    Optional<Cliente> findById(Integer id);

    Cliente save (Cliente cliente);
    Iterable<Cliente> findAll();
    void deleteById(Integer id);
}
