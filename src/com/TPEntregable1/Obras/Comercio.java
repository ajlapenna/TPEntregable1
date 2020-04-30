package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public class Comercio extends Comercial {
    private String rubro;

    public Comercio(String direccion, short mtsCuadrados, float costoPorMetroC, short diasEstimados, ArrayList<Empleado> empleados, String nombreObra, String rubro) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados, nombreObra);
        this.rubro = rubro;
    }
}
