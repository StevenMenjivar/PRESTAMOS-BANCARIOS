package com.PrestamoBancarios.Prestamo.repositorios;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

    Iterable<Empleado> findEmpleadoByNombreContains(String nombreEmpleado);
    Iterable<Empleado> findEmpleadoByNombreContainsIgnoreCase(String nombreEmpleado);
    Iterable<Empleado> findEmpleadoByApellidoContains(String apellidoEmpleado);

}
