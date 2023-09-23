import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GrainsTest {

    Grains grains = new Grains();

    @Test
    public void testGrainsOnSquare1() {
        assertEquals(new BigInteger("1"), grains.grainsOnSquare(1));
    }

    @Test
    public void testGrainsOnSquare2() {
        assertEquals(new BigInteger("2"), grains.grainsOnSquare(2));
    }

    @Test
    public void testGrainsOnSquare3() {
        assertEquals(new BigInteger("4"), grains.grainsOnSquare(3));
    }

    @Test
    public void testGrainsOnSquare4() {
        assertEquals(new BigInteger("8"), grains.grainsOnSquare(4));
    }

    @Test
    public void testGrainsOnSquare16() {
        assertEquals(new BigInteger("32768"), grains.grainsOnSquare(16));
    }

    @Test
    public void testGrainsOnSquare32() {
        assertEquals(new BigInteger("2147483648"), grains.grainsOnSquare(32));
    }

    @Test
    public void testGrainsOnSquare64() {
        assertEquals(new BigInteger("9223372036854775808"), grains.grainsOnSquare(64));
    }

    @Test
    public void testGrainsOnBoard() {
        assertEquals(new BigInteger("18446744073709551615"), grains.grainsOnBoard());
    }

    @Test
    public void testInvalidSquare() {
        assertThrows(IllegalArgumentException.class, () -> {
            grains.grainsOnSquare(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            grains.grainsOnSquare(65);
        });
    }
}