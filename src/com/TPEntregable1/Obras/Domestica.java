package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Empleado;

import java.util.ArrayList;

public class Domestica extends Obra {
    private byte cantHabitaciones;

    public Domestica(String direccion,
                     short mtsCuadrados,
                     float costoPorMetroC,
                     short diasEstimados,
                     ArrayList<Empleado> empleados,
                     byte cantHabitaciones) {
        super(direccion, mtsCuadrados, costoPorMetroC, diasEstimados, empleados);
        this.cantHabitaciones = cantHabitaciones;
    }
}
