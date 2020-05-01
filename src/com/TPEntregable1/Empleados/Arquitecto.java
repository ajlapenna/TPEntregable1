package com.TPEntregable1.Empleados;

import com.TPEntregable1.GlobalData;

public class Arquitecto extends Empleado {
    private String matricula;

    public Arquitecto(String name, int dni, String telephoneNumber, float costoPorDia, String matricula) {
        super(name, dni, telephoneNumber, costoPorDia);
        this.matricula = matricula;
    }

    public Arquitecto(String name, int dni, String telephoneNumber, String matricula) {
        super(name, dni, telephoneNumber, GlobalData.COSTO_POR_DIA_ARQUITECTO);
        this.matricula = matricula;
    }

    public void crearPlano() {
        System.out.println("Creando mi próximo plano.");
    }

    @Override
    public String toString() {
        return "Arquitecto{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", telefono='" + telefono + '\'' +
                ", costoPorDia=" + costoPorDia +
                "}\n";
    }
}
