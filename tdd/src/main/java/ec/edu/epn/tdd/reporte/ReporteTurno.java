package ec.edu.epn.tdd.reporte;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReporteTurno {

    private String nombreEmpleado;
    private String turno;

    public int calcularEfectivo(int cien, int cincuenta, int veinte, int diez, int cinco, int uno) {
        return cien*100 + cincuenta*50 + veinte*20 + diez*10 + cinco*5 + uno*1;
    }

    public double calcularMonedas(int uno, int cincuenta, int veinticinco, int diez, int cinco, int centavo) {
        return uno*1 + cincuenta*0.5 + veinticinco*0.25 + diez*0.1 + cinco*0.05 + centavo*0.01;
    }

    public ArrayList<Double> ingresarVentas(ArrayList<Double> lecturas, ArrayList<Integer> billetes,
                                            ArrayList<Integer> monedas, double tarjetas, int numLubricantes) {
        double ventaEnGalonesSuper = lecturas.get(1) - lecturas.get(0);
        double ventaEnGalonesExtra = lecturas.get(3) - lecturas.get(2);
        double ventaEnGalonesDiesel = lecturas.get(5) - lecturas.get(4);
        double totalGalonesSuper = Math.round(ventaEnGalonesSuper*100.0)/100.0;
        double totalGalonesExtra = Math.round(ventaEnGalonesExtra*100.0)/100.0;
        double totalGalonesDiesel = Math.round(ventaEnGalonesDiesel*100.0)/100.0;
        double totalEfectivo = calcularEfectivo(billetes.get(0),billetes.get(1),billetes.get(2), billetes.get(3),
                billetes.get(4), billetes.get(5)) + calcularMonedas(monedas.get(0), monedas.get(1), monedas.get(2),
                monedas.get(3), monedas.get(4), monedas.get(5));
        double totalLubricantes = numLubricantes*3.50;
        return new ArrayList<>(Arrays.asList(totalGalonesSuper, totalGalonesExtra, totalGalonesDiesel, totalEfectivo,
                                tarjetas, totalLubricantes));
    }

    public double calcularVentas(double galonesSuper, double galonesExtra, double galonesDiesel) {
        double totalSuper = Math.round((galonesSuper*4.27)*100.0)/100.0;
        double totalExtra = Math.round((galonesExtra*2.40)*100.0)/100.0;
        double totalDiesel = Math.round((galonesDiesel*1.80)*100.0)/100.0;
        return totalSuper + totalExtra + totalDiesel;
    }

    public double calcularDiferencia(double totalGalonesSuper, double totalGalonesExtra, double totalGalonesDiesel,
                                     double totalEfectivo, double totalTarjetas) {
        return 0.0;
    }
}
