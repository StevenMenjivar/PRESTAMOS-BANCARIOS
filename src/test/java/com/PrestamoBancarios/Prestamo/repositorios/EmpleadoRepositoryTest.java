package com.PrestamoBancarios.Prestamo.repositorios;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Empleado;
import com.PrestamoBancarios.Prestamo.datos.DatosDummy;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class EmpleadoRepositoryTest {
    @Autowired
    EmpleadoRepository empleadoRepository;
    @BeforeEach
    void setUp(){
        empleadoRepository.save(DatosDummy.empleado01());
        empleadoRepository.save(DatosDummy.empleado02());
        empleadoRepository.save(DatosDummy.empleado03());
    }

    @AfterEach
    void tearDown() {
        empleadoRepository.deleteAll();
    }
    @Test
    @DisplayName("Buscar empleados por nombre")
    void findEmpleadoByNombreContains() {
        //given

        //when
        Iterable<Empleado> expected = empleadoRepository.findEmpleadoByNombreContains("Mario");

        //then
        assertThat(((List<Empleado>)expected).size() == 1).isTrue();
    }

//    @Test
//    @Disabled
//    void findEmpleadoByNombreContainsIgnoreCase() {
//    }
//
//    @Test
//    @Disabled
//    void findEmpleadoByApellidoContains() {
//    }
}