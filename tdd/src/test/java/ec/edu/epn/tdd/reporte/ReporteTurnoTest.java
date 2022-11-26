package ec.edu.epn.tdd.reporte;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReporteTurnoTest {

    @Test
    public void given_six_integers_when_counting_money_then_ok() {
        ReporteTurno reporteTurno = new ReporteTurno();
        int expected = 270;
        int actual = reporteTurno.calcularEfectivo(0, 1, 4, 10, 7, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void given_six_integers_when_counting_coins_then_ok(){
        ReporteTurno reporteTurno = new ReporteTurno();
        double expected = 179.54d;
        double actual = reporteTurno.calcularMonedas(105, 50, 120, 150, 73, 89);
        assertEquals(expected, actual, 0.05);
    }

    @Test
    public void given_a_list_of_sales_when_insertion_then_ok() {
        ReporteTurno reporteTurno = new ReporteTurno();
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(67.01, 253.95, 613.00, 2147.82, 145.57, 3.50));
        ArrayList<Double> galones = new ArrayList<>(Arrays.asList(286971.58, 287038.59, 458868.76, 459122.71, 886154.00,
                886767.00));
        ArrayList<Integer> billetes = new ArrayList<>(Arrays.asList(0, 0, 65, 32, 17, 0));
        ArrayList<Integer> monedas = new ArrayList<>(Arrays.asList(205, 269, 325, 110, 200, 107));
        ArrayList<Double> actual = reporteTurno.ingresarVentas(galones, billetes, monedas, 145.57, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_list_of_gallons_when_conversion_to_money_then_ok() {
        ReporteTurno reporteTurno = new ReporteTurno();
        double expected = (286.13 + 609.48 + 1103.4);
        double actual = reporteTurno.calcularVentas(67.01, 253.95, 613.00);
        assertEquals(expected, actual, 0.05);
    }

    @Test
    public void given_a_list_of_sales_when_comparing_then_ok() {
        ReporteTurno reporteTurno = new ReporteTurno();
        double expected = 4.69;
        double actual = reporteTurno.calcularDiferencia(67.01, 253.95, 613.00, 1834.67, 159.65);
        assertEquals(expected, actual, 0.05);
    }

}