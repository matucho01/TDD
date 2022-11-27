package ec.edu.epn.tdd.reporte;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ReporteTurnoParametersTest {

    private double totalVentasLecturas, totalEntregas;
    private boolean expected;

    public ReporteTurnoParametersTest(double totalVentasLecturas, double totalEntregas, boolean expected) {
        this.totalVentasLecturas = totalVentasLecturas;
        this.totalEntregas = totalEntregas;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1567.89, 1563.95, true});
        objects.add(new Object[]{1745.36, 1725.17, false});
        objects.add(new Object[]{1006.44, 1004.23, true});
        objects.add(new Object[]{1314.50, 1289.33, false});
        objects.add(new Object[]{998.15, 1001.40, true});
        return objects;
    }

    @Test
    public void given_parameters_when_comparing_then_ok() {
        ReporteTurno reporteTurno = new ReporteTurno();
        boolean actual = reporteTurno.sobranteFaltante(totalVentasLecturas, totalEntregas);
        assertSame(actual, expected);
    }

}