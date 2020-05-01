package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public class Comercio extends Comercial {
    private String rubro;

    public Comercio(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, ArrayList<Empleado> empleados, String nombreObra, String rubro) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados, nombreObra);
        this.rubro = rubro;
    }

    public Comercio(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, String nombreObra, String rubro) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, nombreObra);
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "Comercio{" +
                "rubro='" + rubro + '\'' +
                ", nombreObra='" + nombreObra + '\'' +
                ", direccion='" + direccion + '\'' +
                ", mtsCuadrados=" + mtsCuadrados +
                ", costoPorMetroC=" + costoPorMetroC +
                ", costoTotal=" + costoTotalObra() +
                ", diasEstimados=" + diasEstimados +
                ", empleados=" + empleados +
                "}\n";
    }
}
