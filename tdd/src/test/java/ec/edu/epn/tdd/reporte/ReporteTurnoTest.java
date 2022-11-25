package ec.edu.epn.tdd.reporte;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

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

    /*@Test
    public void given_a_list_of_sales_when_insertion_then_ok() {
        ReporteTurno reporteTurno = new ReporteTurno();
        ArrayList<Float> expected = ;
        ArrayList<Float> actual = ;
    }*/
}