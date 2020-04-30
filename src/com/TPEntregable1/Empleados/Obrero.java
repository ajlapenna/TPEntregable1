package com.TPEntregable1.Empleados;

public class Obrero extends Empleado implements FuncionesObreros {
    private byte edad;

    protected Obrero(String name, int dni, String telephoneNumber, short costoPorDia, byte edad) {
        super(name, dni, telephoneNumber, costoPorDia);
        this.edad = edad;
    }

    @Override
    public void construir() {
        System.out.println("Soy obrero y construyo.");
    }
}
