package com.PrestamoBancarios.Prestamo;

<<<<<<< Updated upstream
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import com.PrestamoBancarios.Prestamo.Modelo.entidades.Cliente;
import com.PrestamoBancarios.Prestamo.Modelo.entidades.Prestamo;
import com.PrestamoBancarios.Prestamo.servicios.contratos.ClienteDAO;
import com.PrestamoBancarios.Prestamo.servicios.contratos.EmpleadoDAO;
import com.PrestamoBancarios.Prestamo.servicios.contratos.PrestamoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
>>>>>>> Stashed changes

@SpringBootApplication
public class PrestamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestamoApplication.class, args);
	}

<<<<<<< Updated upstream
=======
//
//	@Bean
//	public CommandLineRunner runner(){
//		return args -> {
//			Prestamo prestamo = new Prestamo(null,100.5,20.5,10,5);
//			Prestamo prestamo1 = new Prestamo(null,5000.0,20.5,10,5);
//			Cliente cliente = new Cliente(null,"Saul","Abarca",24,  "1002515-2" ,500.00);
//			Cliente cliente1 = new Cliente(null,"Valeria","Lopz",24,  "1002515-2" ,500.00);
////
////			List<Empleado> empleados= new ArrayList<(3,"Odir","Lopez")>;
//
//		    /*Cliente save = servicio.save(cliente);
//			System.out.println(save.toString());
//			Prestamo save1 = servicio1.save(prestamo);
//			System.out.println(save1.toString());*/
//
//			/*Set<Empleado> miLista= new HashSet<>();
//					miLista.add(new Empleado(3,"Odir","Lopez"));*/
//
//			prestamo.setCliente(cliente);
//			//prestamo.setEmpleados(miLista);
//			Prestamo save = servicio1.save(prestamo);
//
//			//aqui se guarda otro usuario
//			prestamo1.setCliente(cliente1);
//			//prestamo1.setEmpleados(miLista);
//			Prestamo save2 = servicio1.save(prestamo1);
//		};
//	}
>>>>>>> Stashed changes
}
