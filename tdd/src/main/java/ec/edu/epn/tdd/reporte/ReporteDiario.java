package ec.edu.epn.tdd.reporte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public boolean generarArchivo(ArrayList<Double> ventasTotales) {
        try {
            String nombreArchivo = "VentasDiarias"+".txt";
            File archivo = new File(nombreArchivo);
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente");
                FileWriter fw = new FileWriter(nombreArchivo);
                String pedido = "El pedido es para " + (numDias - 2) + " días: " +
                        "\nSuper: " + this.galonesSuper + "00" +
                        "\nExtra: " + this.galonesExtra + "00" +
                        "\nDiesel: " + this.galonesDiesel + "00" +
                        "\nRevisado por: Gerente";
                fw.write(pedido);
                fw.close();
                return true;
            }
            return false;
        }catch(IOException e) {
            System.out.print("No se puede crear el archivo con el pedido, error: ");
            e.printStackTrace();
            return false;
        }
    }
}
