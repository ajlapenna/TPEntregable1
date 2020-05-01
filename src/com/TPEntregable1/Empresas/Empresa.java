package com.TPEntregable1.Empresas;

import com.TPEntregable1.Empleados.Empleado;
import com.TPEntregable1.Obras.Obra;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Obra> obras;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, ArrayList<Obra> obras, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.obras = obras;
        this.empleados = empleados;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        obras = new ArrayList<Obra>();
        empleados = new ArrayList<Empleado>();
    }

    public void nuevaObra(Obra nueva) {
        if (!(nueva.empleadosMinimos()))
            throw new InvalidParameterException("No se puede añadir la obra.\nPor favor verifique los empleados.");
        obras.add(nueva);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    private void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public void agregarObra(Obra o) {
        obras.add(o);
    }

    public void agregarObra(ArrayList<Obra> o) {
        obras.addAll(o);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    private void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void agregarEmpleado(ArrayList<Empleado> e) {
        empleados.addAll(e);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                "\nobras=" + obras +
                "\nempleados=" + empleados +
                "}\n";
    }

    public String mostrarObras() {
        return "Obras{" + obras + '}';
    }
}
