package com.TPEntregable1.Empleados;

public class Arquitecto extends Empleado {
    private String matricula;

    public Arquitecto(String name, int dni, String telephoneNumber, short costoPorDia, String matricula) {
        super(name, dni, telephoneNumber, costoPorDia);
        this.matricula = matricula;
    }

    public void crearPlano() {
        System.out.println("Creando mi próximo plano.");
    }
}
