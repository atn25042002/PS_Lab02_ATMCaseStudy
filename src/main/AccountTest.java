package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/**
 * The test class AccountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AccountTest extends TestCase
{
    Account account;
    /**
     * Default constructor for test class AccountTest
     */
    public AccountTest()
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
        account= new Account(12345, 54321, 1000.0, 1200.0);
    }
    
    public void testValidatePin_Test5(){
        //Prueba con PIN correcto
        int pin= 54321;
        assertEquals(true, account.validatePIN(pin));
    }
    
    public void testValidatePin_Test6(){
        //Prueba con PIN incorrecto
        int pin= 55555;
        assertEquals(false, account.validatePIN(pin));
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
