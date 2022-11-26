package ec.edu.epn.tdd.reporte;

import java.util.ArrayList;

public class CuadreTurno {
    public ArrayList<Double> calcularVentas(double galonesSuper, double galonesExtra, double galonesDiesel) {
        double totalSuper = Math.round((galonesSuper*4.20)*100.0)/100.0;
        double totalExtra = Math.round((galonesExtra*4.20)*100.0)/100.0;
        double totalDiesel = Math.round((galonesDiesel*4.20)*100.0)/100.0;
        return null;
    }
}
