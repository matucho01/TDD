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

    public boolean generarArchivo(ArrayList<Double> ventasTotales, String fecha) {
        try {
            String nombreArchivo = "Ventas " + fecha + ".txt";
            File archivo = new File(nombreArchivo);
            if(archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente");
                FileWriter fw = new FileWriter(nombreArchivo);
                String pedido = "Reporte Diario" +
                        "\nFecha: " + fecha +
                        "\nDespacho Super: " + ventasTotales.get(0) +
                        "\nDespacho Extra: " + ventasTotales.get(1) +
                        "\nDespacho Diesel: " + ventasTotales.get(2) +
                        "\nEfectivo: " + ventasTotales.get(3) +
                        "\nTarjetas: " + ventasTotales.get(4) +
                        "\nVenta Lubricantes: " + ventasTotales.get(5);
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
