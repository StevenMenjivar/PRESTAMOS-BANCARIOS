package com.PrestamoBancarios.Prestamo.datos;

import com.PrestamoBancarios.Prestamo.modelo.entidades.Cliente;
import com.PrestamoBancarios.Prestamo.modelo.entidades.Empleado;
import com.PrestamoBancarios.Prestamo.modelo.entidades.Garantia;
import com.PrestamoBancarios.Prestamo.modelo.entidades.Prestamo;

public class DatosDummy {
    public static Empleado empleado01(boolean conId){
        Empleado empleado=(conId) ? new Empleado(1,"Mario","López"):
                new Empleado(null,"Mario","López");
        return empleado;
    }
    public static Empleado empleado02(boolean conId){

        Empleado empleado=(conId) ? new  Empleado(2,"Rodrigo","Ruiz"):
                new Empleado(null,"Rodrigo","Ruiz");
        return empleado;
    }
    public static Empleado empleado03(){
        return new Empleado(null,"Fernando","Gómez");
    }

    //INGRESANDO DATOS PARA CLIENTE
    public static Cliente cliente01(boolean conId){
        Cliente cliente = (conId) ? new Cliente(1,"Juan","Guzman",35,"08067854-0",1500.0):
                new Cliente(null,"Juan","Guzman",35,"08067854-0",1500.0);
        return cliente;
    }
    public static Cliente cliente02(boolean conId){
        Cliente cliente = (conId) ? new Cliente(2,"Pedro","Gavidia",44,"08067855-0",800.0):
                new Cliente(null,"Pedro","Gavidia",44,"08067855-0",800.0);
        return cliente;
    }
    public static Cliente cliente03(boolean conId){
        Cliente cliente = (conId) ? new Cliente(3,"Luis","Martinez",25,"09767855-0",1100.0):
                new Cliente(null,"Luis","Martinez",25,"09767855-0",1100.0);
        return cliente;
    }

    //INGRESANDO DATOS PARA PRESTAMO

    public static Prestamo prestamo01(boolean conId){
        Prestamo prestamo=(conId) ? new Prestamo(1,new Cliente(null,"Alex","Menendez",44,"05074312-0",1300.00),450.50,13.1,4,48):
                new Prestamo(null,new Cliente(null,"Alex","Menendez",44,"05074312-0",1300.00),450.50,13.1,4,48);
        return prestamo;
    }
    public static Prestamo prestamo02(){
        return new Prestamo(null,new Cliente(null,"Maria","Lopez",35,"05074344-9",1200.00),1000.50,12.1,2,24);
    }
    public static Prestamo prestamo03(){
        return new Prestamo(null,new Cliente(null,"Rodrigo","Fuentes",40,"05074132-6",1100.00),1000.50,12.1,2,24);
    }

}
