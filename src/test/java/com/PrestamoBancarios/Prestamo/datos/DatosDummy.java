package com.PrestamoBancarios.Prestamo.datos;

import com.PrestamoBancarios.Prestamo.Modelo.entidades.Empleado;

public class DatosDummy {
    public static Empleado empleado01(){
        return new Empleado(null,"Mario","López");
    }
    public static Empleado empleado02(){
        return new Empleado(null,"Rodrigo","Ruiz");
    }
    public static Empleado empleado03(){
        return new Empleado(null,"Fernando","Gómez");
    }
}
