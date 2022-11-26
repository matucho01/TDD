package ec.edu.epn.tdd.reporte;

import java.util.ArrayList;

public class Turno {
    private String turno;
    private String fecha;
    private ArrayList<Double> ventasTurno;
    private String nombreEmpleado;
    private String cedulaEmpleado;

    public static boolean esValida(String ci) {
        if(ci.length()!=10){
            return false;
        }
        int comprobador = Integer.parseInt("" + ci.charAt(9));
        int impares = 0;
        int pares = 0;
        int aux;
        for (int i = 0; i < 9; i += 2) {
            aux = Integer.parseInt("" + ci.charAt(i));
            aux *= 2;
            if (aux > 9) {
                aux -= 9;
            }
            impares += aux;
        }
        for (int i = 1; i < 9; i += 2) {
            aux = Integer.parseInt("" + ci.charAt(i));
            pares += aux;
        }
        aux = pares + impares;
        aux = (int)(Math.round((double) aux / 10) * 10) - aux;
        return aux == comprobador;
    }
}
