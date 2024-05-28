package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/**
 * The test class ATMTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ATMTest extends TestCase
{
    private ATM theATM;
    /**
     * Default constructor for test class ATMTest
     */
    public ATMTest()
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
        theATM = new ATM();
    }

    public void testDisplayMainMenu_Test07() {
        assertEquals(1, theATM.displayMainMenu());
    }
    
    public void testDisplayMainMenu_Test11() {
        assertEquals(2, theATM.displayMainMenu());
    }
    
    public void testDisplayMainMenu_Test26() {
        assertEquals(3, theATM.displayMainMenu());
    }
    
    public void testCreateTransaction_Test08() {
        int opcion= 1;
        assertTrue(BalanceInquiry.class.isInstance(theATM.createTransaction(opcion)));
    }
    
    public void testCreateTransaction_Test12() {
        int opcion= 2;
        assertTrue(Withdrawal.class.isInstance(theATM.createTransaction(opcion)));
    }
    
    public void testCreateTransaction_Test27() {
        int opcion= 3;
        assertTrue(Deposit.class.isInstance(theATM.createTransaction(opcion)));
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
