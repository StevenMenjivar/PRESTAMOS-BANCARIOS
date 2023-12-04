package com.PrestamoBancarios.Prestamo.servicios.implementaciones;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Empleado;
import com.PrestamoBancarios.Prestamo.repositorios.EmpleadoRepository;
import com.PrestamoBancarios.Prestamo.servicios.contratos.EmpleadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmpleadoDAOImpl extends GenericoDAOImpl<Empleado, EmpleadoRepository> implements EmpleadoDAO {

    @Autowired
    public EmpleadoDAOImpl(EmpleadoRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Empleado> findEmpleadoByNombreContains(String nombreEmpleado) {
        return repository.findEmpleadoByNombreContains(nombreEmpleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Empleado> findEmpleadoByNombreContainsIgnoreCase(String nombreEmpleado) {
        return repository.findEmpleadoByNombreContainsIgnoreCase(nombreEmpleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Empleado> findEmpleadoByApellidoContains(String apellidoEmpleado) {
        return repository.findEmpleadoByApellidoContains(apellidoEmpleado);
    }
}
