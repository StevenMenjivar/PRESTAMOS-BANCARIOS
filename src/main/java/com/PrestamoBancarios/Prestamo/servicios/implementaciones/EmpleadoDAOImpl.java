package com.PrestamoBancarios.Prestamo.servicios.implementaciones;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Empleado;
import com.PrestamoBancarios.Prestamo.repositorios.EmpleadoRepository;
import com.PrestamoBancarios.Prestamo.servicios.contratos.EmpleadoDAO;
<<<<<<< HEAD
import com.PrestamoBancarios.Prestamo.servicios.contratos.PrestamoDAO;
=======
>>>>>>> main
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import java.util.Optional;

@Service
public class EmpleadoDAOImpl implements EmpleadoDAO {

    @Autowired
    private EmpleadoRepository repository;


    @Override
    @Transactional(readOnly = true)
    public Optional<Empleado> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Empleado save(Empleado entidad) {
        return repository.save(entidad);
=======
@Service
public class EmpleadoDAOImpl extends GenericoDAOImpl<Empleado, EmpleadoRepository> implements EmpleadoDAO {

    @Autowired
    public EmpleadoDAOImpl(EmpleadoRepository repository) {
        super(repository);
>>>>>>> main
    }

    @Override
    @Transactional(readOnly = true)
<<<<<<< HEAD
    public Iterable<Empleado> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
=======
    public Iterable<Empleado> findEmpleadoByNombreEmpleadoContains(String nombreEmpleado) {
        return repository.findEmpleadoByNombreEmpleadoContains(nombreEmpleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Empleado> findEmpleadoByNombreEmpleadoContainsIgnoreCase(String nombreEmpleado) {
        return repository.findEmpleadoByNombreEmpleadoContainsIgnoreCase(nombreEmpleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Empleado> findEmpleadoByApellidoEmpleadoContains(String apellidoEmpleado) {
        return repository.findEmpleadoByApellidoEmpleadoContains(apellidoEmpleado);
    }
}

>>>>>>> main
