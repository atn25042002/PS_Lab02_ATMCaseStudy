package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CashDispenserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CashDispenserTest
{
    CashDispenser cashDispenser;
    /**
     * Default constructor for test class CashDispenserTest
     */
    public CashDispenserTest()
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
        cashDispenser = new CashDispenser();
    }
    
    @Test
    public void testIsSufficientCashAvailable_Test22(){
        int amount= 20000;
        assertEquals(false, cashDispenser.isSufficientCashAvailable(amount));
    }
    
    @Test
    public void testIsSufficientCashAvailable_Test23(){
        int amount= 10000;
        assertEquals(true, cashDispenser.isSufficientCashAvailable(amount));
    }
    
    @Test
    public void testIsSufficientCashAvailable_Test24(){
        int amount= 5000;
        assertEquals(true, cashDispenser.isSufficientCashAvailable(amount));
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
