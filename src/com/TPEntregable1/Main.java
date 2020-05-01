package com.TPEntregable1;

import com.TPEntregable1.Empleados.*;
import com.TPEntregable1.Empresas.Empresa;
import com.TPEntregable1.Obras.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var arquitecto1 = new Arquitecto("Carlos", 17000123, "+542233000001", 2000F, "M4321");
        var arquitecto2 = new Arquitecto("Gustavo", 20654720, "+542233000002", "M8551");
        var maestro1 = new MaestroMayor("Romeo", 22682123, "+541149654321", 1800F, (byte)40);
        var maestro2 = new MaestroMayor("Santos", 21432776, "+542234123567", (byte)45);
        var obrero1 = new Obrero("Pedro", 34331009, "+542235123456", 1500F, (byte)29);
        var obrero2 = new Obrero("Juan", 32337021, "+542235648123", (byte)31);
        var obrero3 = new Obrero("Diego", 32741264, "+542235348791", (byte)30);

        arquitecto1.crearPlano();
        maestro1.construir();
        obrero1.construir();

        var arregloEmpleadosHotel = new ArrayList<Empleado>();
        arregloEmpleadosHotel.add(arquitecto1);
        arregloEmpleadosHotel.add(maestro1);
        arregloEmpleadosHotel.add(maestro2);
        arregloEmpleadosHotel.add(obrero1);
        arregloEmpleadosHotel.add(obrero2);
        arregloEmpleadosHotel.add(obrero3);

        var arregloEmpleadosComercio = new ArrayList<Empleado>();
        arregloEmpleadosComercio.add(arquitecto1);
        arregloEmpleadosComercio.add(maestro1);
        arregloEmpleadosComercio.add(obrero2);
        arregloEmpleadosComercio.add(obrero3);

        var arregloEmpleadosDomestica = new ArrayList<Empleado>();
        arregloEmpleadosDomestica.add(arquitecto2);
        arregloEmpleadosDomestica.add(maestro2);
        arregloEmpleadosDomestica.add(obrero1);
        arregloEmpleadosDomestica.add(obrero2);

        var empresa1 = new Empresa("Pinti");
        empresa1.agregarEmpleado(arquitecto1);
        empresa1.agregarEmpleado(arquitecto2);
        empresa1.agregarEmpleado(arregloEmpleadosHotel);

        //System.out.println(empresa1.toString());

        var hotel1 = new Hotel("Qwe 123", 125, 400, 365, "Sarak", 10);
        var comercio1 = new Comercio("Fras 445", 100, 200, 50, "Los Mareados", "Vinoteca");
        var casa1 = new Domestica("Av. Siempreviva 742", 80, 175, 30, 4);

        casa1.agregarEmpleado(arregloEmpleadosDomestica);
        hotel1.agregarEmpleado(arregloEmpleadosHotel);
        comercio1.agregarEmpleado(arregloEmpleadosComercio);

        empresa1.agregarObra(hotel1);
        empresa1.agregarObra(comercio1);
        empresa1.agregarObra(casa1);

        //System.out.println(casa1.toString());
        System.out.println(empresa1.mostrarObras());
    }
}
