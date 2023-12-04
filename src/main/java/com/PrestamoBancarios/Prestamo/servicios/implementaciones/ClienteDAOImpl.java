package com.PrestamoBancarios.Prestamo.servicios.implementaciones;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Cliente;
import com.PrestamoBancarios.Prestamo.repositorios.ClienteRepository;
import com.PrestamoBancarios.Prestamo.servicios.contratos.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteDAOImpl implements ClienteDAO {

    @Autowired
    @Qualifier("repositoriocliente")
    private ClienteRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        repository.findById(id);
    }
}
