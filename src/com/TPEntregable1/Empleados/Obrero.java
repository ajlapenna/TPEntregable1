package com.TPEntregable1.Empleados;

import com.TPEntregable1.GlobalData;

public class Obrero extends Empleado implements FuncionesObreros {
    private byte edad;

    public Obrero(String name, int dni, String telephoneNumber, float costoPorDia, byte edad) {
        super(name, dni, telephoneNumber, costoPorDia);
        this.edad = edad;
    }

    public Obrero(String name, int dni, String telephoneNumber, byte edad) {
        super(name, dni, telephoneNumber, GlobalData.COSTO_POR_DIA_OBRERO);
        this.edad = edad;
    }

    @Override
    public void construir() {
        System.out.println("Soy obrero y construyo.");
    }

    @Override
    public String toString() {
        return "Obrero{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", telefono='" + telefono + '\'' +
                ", costoPorDia=" + costoPorDia +
                "}\n";
    }
}
