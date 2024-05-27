package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import java.util.Scanner;

/**
 * The test class ATMTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ATMTest extends TestCase
{
    private ATM theATM;
    private Scanner input;
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
        input = new Scanner(System.in);
    }

    public void testdisplayMainMenu_Opc1() {
        assertEquals(1, theATM.displayMainMenu());
    }
    
    public void testdisplayMainMenu_Opc2() {
        assertEquals(1, theATM.displayMainMenu());
    }
    
    public void testdisplayMainMenu_Opc3() {
        assertEquals(1, theATM.displayMainMenu());
    }
    
    public void testdisplayMainMenu_Opc4() {
        assertEquals(1, theATM.displayMainMenu());
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
