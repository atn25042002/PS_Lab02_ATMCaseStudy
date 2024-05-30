package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DepositSlotTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DepositSlotTest
{
    DepositSlot depositSlot;
    /**
     * Default constructor for test class DepositSlotTest
     */
    public DepositSlotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        depositSlot = new DepositSlot();
    }
    
    @Test
    public void testIsEnvelopeReceived_Test35(){
        assertEquals(true, depositSlot.isEnvelopeReceived());
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
