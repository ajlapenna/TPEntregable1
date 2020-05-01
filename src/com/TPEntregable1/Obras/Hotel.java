package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public class Hotel extends Comercial {
    private int cantPisos;

    public Hotel(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, ArrayList<Empleado> empleados, String nombreObra, int cantPisos) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados, nombreObra);
        this.cantPisos = cantPisos;
    }

    public Hotel(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, String nombreObra, int cantPisos) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, nombreObra);
        this.cantPisos = cantPisos;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombreObra='" + nombreObra + '\'' +
                ", cantPisos=" + cantPisos +
                ", direccion='" + direccion + '\'' +
                ", mtsCuadrados=" + mtsCuadrados +
                ", costoPorMetroC=" + costoPorMetroC +
                ", costoTotal=" + costoTotalObra() +
                ", diasEstimados=" + diasEstimados +
                ", empleados=" + empleados +
                "}\n";
    }
}
