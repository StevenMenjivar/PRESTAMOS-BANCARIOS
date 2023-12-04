package com.PrestamoBancarios.Prestamo.servicios.contratos;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Cliente;


import java.util.Optional;


public interface ClienteDAO extends GenericoDAO<Cliente>{

    Iterable<Cliente> findClienteByNombreClienteContains(String nombreCliente);
    Iterable<Cliente> findClienteByEdadClienteBetween(Integer edadCliente,Integer edadCliente2 );
    Iterable<Cliente> findClienteBySueldoLiquidoClienteAfter(Double sueldoLiquidoCliente);


}
