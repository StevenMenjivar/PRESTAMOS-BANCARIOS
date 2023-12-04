package com.PrestamoBancarios.Prestamo.servicios.contratos;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Empleado;

public interface EmpleadoDAO extends GenericoDAO<Empleado>{
    Iterable<Empleado> findEmpleadoByNombreContains(String nombreEmpleado);
    Iterable<Empleado> findEmpleadoByNombreContainsIgnoreCase(String nombreEmpleado);
    Iterable<Empleado> findEmpleadoByApellidoContains(String apellidoEmpleado);

}
