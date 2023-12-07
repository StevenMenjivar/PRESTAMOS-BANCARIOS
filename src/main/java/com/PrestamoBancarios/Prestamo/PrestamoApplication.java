package com.PrestamoBancarios.Prestamo;

import com.PrestamoBancarios.Prestamo.modelo.entidades.*;
import com.PrestamoBancarios.Prestamo.modelo.entidades.enumeradores.SucursalEnum;
import com.PrestamoBancarios.Prestamo.modelo.entidades.enumeradores.TipoClienteEnum;
import com.PrestamoBancarios.Prestamo.modelo.entidades.enumeradores.TipoPrestamoEnum;
import com.PrestamoBancarios.Prestamo.servicios.contratos.GenericoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@SpringBootApplication
public class PrestamoApplication {


	@Autowired
	private GenericoDAO<Cliente> servicio;
	@Autowired
	private GenericoDAO<Prestamo> servicio1;


	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(PrestamoApplication.class, args).getBeanDefinitionNames();
		/*for(String str : beanDefinitionNames){
			System.out.println(str);
		}*/
	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {

			Prestamo prestamo = new Prestamo(null,new Cliente(null,"Saul","Abarca",24,  "1002515-2" ,500.00,new TipoCliente(TipoClienteEnum.EMPLEADO_GOBIERNO.toString())),500.0,10.0,5,20,
					new Fiador("Oscar","Perez","0256444-5"),new Garantia("terreno de 20 cuadras"),new TipoPrestamo(TipoPrestamoEnum.CREDITO_ESTUDIO.toString()),new Empleado(null,"Vanessa","Perez",new Sucursal(null,
					SucursalEnum.AGENCIA_GALERIAS.toString(),"Salvador del mundo")));

			Prestamo save = servicio1.save(prestamo);


			//Cliente cliente = new Cliente(null,"Saul","Abarca",24,  "1002515-2" ,500.00);
			//Cliente cliente1 = new Cliente(null,"Valeria","Lopz",24,  "1002515-2" ,500.00);

			//List<Empleado> empleados= new ArrayList<(3,"Odir","Lopez")>;

		  //  Cliente save = servicio.save(cliente);

			//System.out.println(save.toString());
//			Prestamo save1 = servicio1.save(prestamo);
//			System.out.println(save1.toString());

//			Set<Empleado> miLista= new HashSet<>();
//					miLista.add(new Empleado(3,"Odir","Lopez"));
//
//			prestamo.setCliente(cliente);
//			//prestamo.setEmpleados(miLista);
//			Prestamo save = servicio1.save(prestamo);
//
//			//aqui se guarda otro usuario
//			prestamo1.setCliente(cliente1);
//			//prestamo1.setEmpleados(miLista);
//			Prestamo save2 = servicio1.save(prestamo1);
		};
	}

}
