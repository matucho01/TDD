package ec.edu.epn.tdd.reporte;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurnoTest {

    @Test
    public void given_a_string_when_validation_then_ok() {
        Turno turno = new Turno();
        boolean expected = true;
        boolean actual = turno.esValida("1003546486");
        assertEquals(expected, actual);
    }
}