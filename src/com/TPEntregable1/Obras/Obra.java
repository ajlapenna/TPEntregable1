package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public abstract class Obra {
    protected String direccion;
    protected short mtsCuadrados;
    protected float costoPorMetroC;
    protected short diasEstimados;
    protected ArrayList<Empleado> empleados;

    protected Obra(String direccion,
                   short mtsCuadrados,
                   float costoPorMetroC,
                   short diasEstimados,
                   ArrayList<Empleado> empleados) {
        this.direccion = direccion;
        this.mtsCuadrados = mtsCuadrados;
        this.costoPorMetroC = costoPorMetroC;
        this.diasEstimados = diasEstimados;
        this.empleados = empleados;
    }

    public float costoTotalObra() {
        return (float)(costoPorMetroC * mtsCuadrados + diasEstimados * empleados.stream().mapToDouble(i -> i.getCostoPorDia()).sum());
    }
}
