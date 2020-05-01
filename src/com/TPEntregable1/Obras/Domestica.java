package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public class Domestica extends Obra {
    private int cantHabitaciones;

    public Domestica(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, ArrayList<Empleado> empleados, int cantHabitaciones) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados);
        this.cantHabitaciones = cantHabitaciones;
    }

    public Domestica(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, int cantHabitaciones) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados);
        this.cantHabitaciones = cantHabitaciones;
    }

    @Override
    public String toString() {
        return "Domestica{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", direccion='" + direccion + '\'' +
                ", mtsCuadrados=" + mtsCuadrados +
                ", costoPorMetroC=" + costoPorMetroC +
                ", costoTotal=" + costoTotalObra() +
                ", diasEstimados=" + diasEstimados +
                ", empleados=" + empleados +
                "}\n";
    }
}
