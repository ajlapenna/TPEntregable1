package com.TPEntregable1.Empleados;

import com.TPEntregable1.GlobalData;

public class MaestroMayor extends Empleado implements FuncionesObreros {
    private byte edad;

    public MaestroMayor(String name, int dni, String telephoneNumber, float costoPorDia, byte edad) {
        super(name, dni, telephoneNumber, costoPorDia);
        this.edad = edad;
    }

    public MaestroMayor(String name, int dni, String telephoneNumber, byte edad) {
        super(name, dni, telephoneNumber, GlobalData.COSTO_POR_DIA_MAESTROMAYOR);
        this.edad = edad;
    }

    @Override
    public void construir() {
        System.out.println("Soy maestro y superviso las construcciones.");
    }

    @Override
    public String toString() {
        return "MaestroMayor{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", telefono='" + telefono + '\'' +
                ", costoPorDia=" + costoPorDia +
                "}\n";
    }
}
