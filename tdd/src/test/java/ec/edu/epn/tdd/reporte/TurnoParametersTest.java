package ec.edu.epn.tdd.reporte;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TurnoParametersTest {

    private String cedula;
    private boolean expected;

    public TurnoParametersTest(String cedula, boolean expected) {
        this.cedula = cedula;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"1720909022", false});
        objects.add(new Object[]{"0201192044", true});
        objects.add(new Object[]{"1003546486", true});
        objects.add(new Object[]{"1001238943", false});
        objects.add(new Object[]{"1729055622", true});
        return objects;
    }

    @Test
    public void given_parameters_when_comparing_then_ok() {
        Turno turno = new Turno();
        boolean actual = turno.esValida(cedula);
        assertSame(actual, expected);
    }

}