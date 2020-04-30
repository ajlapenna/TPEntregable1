package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public abstract class Comercial extends Obra {
    protected String nombreObra;

    protected Comercial(String direccion, short mtsCuadrados, float costoPorMetroC, short diasEstimados, ArrayList<Empleado> empleados, String nombreObra) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados);
        this.nombreObra = nombreObra;
    }
}
