package com.PrestamoBancarios.Prestamo.servicios.implementaciones;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Prestamo;
import com.PrestamoBancarios.Prestamo.repositorios.PrestamoRepository;
import com.PrestamoBancarios.Prestamo.servicios.contratos.PrestamoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PrestamoDAOImpl implements PrestamoDAO {

    @Autowired
    private PrestamoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Prestamo> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Prestamo save(Prestamo prestamo) {
        return repository.save(prestamo);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Prestamo> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
