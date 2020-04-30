package com.TPEntregable1.Empleados;

public class MaestroMayor extends Empleado implements FuncionesObreros {
    private byte edad;

    protected MaestroMayor(String name, int dni, String telephoneNumber, short costoPorDia, byte edad) {
        super(name, dni, telephoneNumber, costoPorDia);
        this.edad = edad;
    }

    @Override
    public void construir() {
        System.out.println("Soy maestro y superviso las construcciones.");
    }
}
