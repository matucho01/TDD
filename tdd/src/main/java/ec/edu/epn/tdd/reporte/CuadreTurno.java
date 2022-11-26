package ec.edu.epn.tdd.reporte;

import java.util.ArrayList;
import java.util.Arrays;

public class CuadreTurno {
    public ArrayList<Double> calcularVentas(double galonesSuper, double galonesExtra, double galonesDiesel) {
        double totalSuper = Math.round((galonesSuper*4.27)*100.0)/100.0;
        double totalExtra = Math.round((galonesExtra*2.40)*100.0)/100.0;
        double totalDiesel = Math.round((galonesDiesel*1.80)*100.0)/100.0;
        return new ArrayList<>(Arrays.asList(totalSuper, totalExtra, totalDiesel));
    }
}
