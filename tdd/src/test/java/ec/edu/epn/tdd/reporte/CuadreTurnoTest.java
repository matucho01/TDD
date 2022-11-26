package ec.edu.epn.tdd.reporte;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CuadreTurnoTest {

    @Test
    public void given_a_list_of_gallons_when_conversion_to_money_then_ok() {
        CuadreTurno cuadreTurno = new CuadreTurno();
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(286.13, 609.48, 1103.4));
        ArrayList<Double> actual = cuadreTurno.calcularVentas(67.01, 253.95, 613.00);
        assertEquals(expected, actual);
    }

    @Test
    public void given_when_then_ok() {
        //CuadreTurno
    }

}