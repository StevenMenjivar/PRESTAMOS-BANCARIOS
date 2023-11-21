package com.PrestamoBancarios.Prestamo;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Cliente;
import com.PrestamoBancarios.Prestamo.modelo.entidades.Empleado;
import com.PrestamoBancarios.Prestamo.modelo.entidades.Prestamo;
import com.PrestamoBancarios.Prestamo.servicios.contratos.ClienteDAO;
import com.PrestamoBancarios.Prestamo.servicios.contratos.EmpleadoDAO;
import com.PrestamoBancarios.Prestamo.servicios.contratos.PrestamoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrestamoApplication {

	@Autowired
	private ClienteDAO servicio;
	@Autowired
	private PrestamoDAO servicio1;
	@Autowired
	private EmpleadoDAO servicio2;

	public static void main(String[] args) {
		SpringApplication.run(PrestamoApplication.class, args);
	}


	@Bean
	public CommandLineRunner runner(){
		return args -> {
			Prestamo prestamo = new Prestamo(null,100.5,20.5,10,5);
			Cliente cliente = new Cliente(null,"Saul","Abarca",24,  "1002515-2" ,500.00);
			Empleado empleado = new Empleado(null,"Odir","Lopez");

		    /*Cliente save = servicio.save(cliente);
			System.out.println(save.toString());
			Prestamo save1 = servicio1.save(prestamo);
			System.out.println(save1.toString());*/

			prestamo.setCliente(cliente);
			prestamo.setEmpleado(empleado);
			Prestamo save = servicio1.save(prestamo);
		};
	}
}
