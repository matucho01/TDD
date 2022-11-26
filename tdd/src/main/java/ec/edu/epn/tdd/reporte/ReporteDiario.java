package ec.edu.epn.tdd.reporte;

import java.util.ArrayList;
import java.util.Arrays;

public class ReporteDiario {

    public ArrayList<Double> totalVentaDiaria(ArrayList<Double> turnoManiana, ArrayList<Double> turnoTarde,
                                              ArrayList<Double> turnoNoche) {
        ArrayList<Double> totalVenta = new ArrayList<>();
        for(int i = 0; i < turnoManiana.size(); i++) {
            totalVenta.add(Math.round((turnoManiana.get(i)+turnoTarde.get(i)+turnoNoche.get(i))*100.0)/100.0);
        }
        return totalVenta;
    }
}
