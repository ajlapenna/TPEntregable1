package com.TPEntregable1.Obras;

import com.TPEntregable1.Empleados.Arquitecto;
import com.TPEntregable1.Empleados.Empleado;
import com.TPEntregable1.Empleados.MaestroMayor;
import com.TPEntregable1.Empleados.Obrero;
import com.TPEntregable1.GlobalData;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public abstract class Obra {
    protected String direccion;
    protected int mtsCuadrados;
    protected float costoPorMetroC;
    protected int diasEstimados;
    protected ArrayList<Empleado> empleados;

    protected Obra(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, ArrayList<Empleado> empleados) {
        this.direccion = direccion;
        this.mtsCuadrados = mtsCuadrados;
        this.costoPorMetroC = costoPorMetroC;
        this.diasEstimados = diasEstimados;
        this.empleados = empleados;
    }

    protected Obra(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados, Empleado empleado) {
        this.direccion = direccion;
        this.mtsCuadrados = mtsCuadrados;
        this.costoPorMetroC = costoPorMetroC;
        this.diasEstimados = diasEstimados;
        empleados = new ArrayList<Empleado>();
        empleados.add(empleado);
    }

    protected Obra(String direccion, int mtsCuadrados, float costoPorMetroC, int diasEstimados) {
        this.direccion = direccion;
        this.mtsCuadrados = mtsCuadrados;
        this.costoPorMetroC = costoPorMetroC;
        this.diasEstimados = diasEstimados;
        empleados = new ArrayList<Empleado>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void agregarEmpleado(ArrayList<Empleado> e) {
        empleados.addAll(e);
    }

    private int cantidadArquitectos() {
        return (int) empleados.stream().filter(a -> a instanceof Arquitecto).count();
    }

    private int cantidadMaestros() {
        return (int) empleados.stream().filter(a -> a instanceof MaestroMayor).count();
    }

    private int cantidadObreros() {
        return (int) empleados.stream().filter(a -> a instanceof Obrero).count();
    }

    public boolean empleadosMinimos() {
        return cantidadArquitectos() == GlobalData.MAX_ARQUITECTOS_POR_OBRA
                && cantidadObreros() >= GlobalData.MIN_OBRERO_POR_OBRA
                && (cantidadMaestros() >= GlobalData.MIN_MAESTROMAYOR_POR_OBRA
                && cantidadMaestros() <= GlobalData.MAX_MAESTROMAYOR_POR_OBRA);
    }

    private float costoEmpleadosObra() {
        if (empleadosMinimos())
            return (float) empleados.stream().mapToDouble(costo -> costo.getCostoPorDia()).sum();
        else
            throw new InvalidParameterException("ERROR");
    }

    public float costoTotalObra() {
        if (!empleadosMinimos())
            throw new InvalidParameterException("No se puede calcular el costo de la obra\nporque no se cumple el requerimiento de empleados.\n" + cantidadEmpleadosObra());
        return costoPorMetroC * mtsCuadrados + diasEstimados * costoEmpleadosObra();
    }

    public String cantidadEmpleadosObra() {
        return "Esta obra tiene " + cantidadArquitectos() + " arquitectos, "
                + cantidadMaestros() + " maestros mayores y "
                + cantidadObreros() + " obreros.";
    }
}
