package com.PrestamoBancarios.Prestamo.servicios.implementaciones;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Sucursal;
import com.PrestamoBancarios.Prestamo.repositorios.SucursalRepository;
import com.PrestamoBancarios.Prestamo.servicios.contratos.SucursalDAO;
import org.springframework.transaction.annotation.Transactional;

public class SucursalDAOImpl extends GenericoDAOImpl<Sucursal, SucursalRepository> implements SucursalDAO {
    public SucursalDAOImpl(SucursalRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Sucursal> findSucursalByNombreSucursalContains(String nombreSucursal) {
        return repository.findSucursalByNombreSucursalContains(nombreSucursal);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Sucursal> findSucursalByNombreSucursalContainsIgnoreCase(String nombreSucursal) {
        return repository.findSucursalByNombreSucursalContainsIgnoreCase(nombreSucursal);
    }
}
