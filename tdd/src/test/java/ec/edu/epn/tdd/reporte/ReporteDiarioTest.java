package ec.edu.epn.tdd.reporte;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReporteDiarioTest {

    ReporteDiario reporteDiario = null;

    @Before
    public void setUp() {
        reporteDiario = new ReporteDiario();
    }

    @Test
    public void given_three_lists_when_addition_then_ok() {
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(15.62, 922.72, 823.88, 2288.08, 265.37, 10.50));
        ArrayList<Double> turnoManiana = new ArrayList<>(Arrays.asList(15.62, 319.32, 149.00, 983.45, 110.68, 7.0));
        ArrayList<Double> turnoTarde = new ArrayList<>(Arrays.asList(0.0, 507.24, 613.0, 1002.13, 118.12, 3.50));
        ArrayList<Double> turnoNoche = new ArrayList<>(Arrays.asList(0.0, 96.16, 61.88, 302.50, 36.57, 0.0));
        ArrayList<Double> actual = reporteDiario.totalVentaDiaria(turnoManiana, turnoTarde, turnoNoche);
        assertEquals(expected, actual);
    }

    @Test
    public void given_a_list_when_creation_of_archive_then_exception(){
        ArrayList<Double> ventasTotales = new ArrayList<>(Arrays.asList(15.62, 922.72, 823.88, 2288.08, 265.37, 10.50));
        boolean actual = reporteDiario.generarArchivo(ventasTotales, "2022-11-25");
        assertTrue(actual);
    }
}