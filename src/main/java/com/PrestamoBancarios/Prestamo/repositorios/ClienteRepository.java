package com.PrestamoBancarios.Prestamo.repositorios;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository("repositoriocliente")
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
