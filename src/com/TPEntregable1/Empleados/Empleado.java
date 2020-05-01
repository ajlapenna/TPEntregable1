package com.TPEntregable1.Empleados;

public abstract class Empleado {
    protected String nombre;
    protected int dni;
    protected String telefono;
    protected float costoPorDia;


    protected Empleado(String name, int dni, String telephoneNumber, float costoPorDia) {
        this.nombre = name;
        this.dni = dni;
        this.telefono = telephoneNumber;
        this.costoPorDia = costoPorDia;
    }

    public float getCostoPorDia() { return costoPorDia; }
}
