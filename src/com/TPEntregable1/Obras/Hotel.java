package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public class Hotel extends Comercial {
    private byte cantPisos;

    public Hotel(String direccion, short mtsCuadrados, short costoPorMetroC, short diasEstimados, ArrayList<Empleado> empleados, String nombreObra, byte cantPisos) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados, nombreObra);
        this.cantPisos = cantPisos;
    }
}
