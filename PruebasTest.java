
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PruebasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PruebasTest
{
    /**
     * Default constructor for test class PruebasTest
     */
    public PruebasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void paraProbar()
    {
        assertEquals(-1, Pruebas.paraProbar(3));    // if x < 4
        assertEquals(8, Pruebas.paraProbar(6));     // else if x % 2 == 0
        assertEquals(8, Pruebas.paraProbar(7));     // else if x % 2 == 0 else 
    }
}


