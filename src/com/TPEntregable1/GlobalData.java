package com.TPEntregable1;

public class GlobalData {
    /*  Solo puede haber UN arquitecto por obra.
     *  Mínimo UN maestro mayor y un máximo de tres por obra.
     *  No hay límite para los obreros pero al menos debe haber 2.
     */

    public static final float COSTO_POR_DIA_ARQUITECTO = 2000;
    public static final float COSTO_POR_DIA_MAESTROMAYOR = 1800;
    public static final float COSTO_POR_DIA_OBRERO = 1500;

    public static final int MAX_ARQUITECTOS_POR_OBRA = 1;
    public static final int MIN_MAESTROMAYOR_POR_OBRA = 1;
    public static final int MAX_MAESTROMAYOR_POR_OBRA = 3;
    public static final int MIN_OBRERO_POR_OBRA = 2;
}
