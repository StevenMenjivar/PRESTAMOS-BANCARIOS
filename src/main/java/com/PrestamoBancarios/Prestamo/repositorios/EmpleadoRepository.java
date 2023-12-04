package com.PrestamoBancarios.Prestamo.repositorios;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Empleado;
<<<<<<< HEAD
import com.PrestamoBancarios.Prestamo.servicios.contratos.GenericoDAO;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
=======
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

    Iterable<Empleado> findEmpleadoByNombreEmpleadoContains(String nombreEmpleado);
    Iterable<Empleado> findEmpleadoByNombreEmpleadoContainsIgnoreCase(String nombreEmpleado);
    Iterable<Empleado> findEmpleadoByApellidoEmpleadoContains(String apellidoEmpleado);

>>>>>>> main
}
