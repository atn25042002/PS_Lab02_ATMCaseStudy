package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class WithdrawalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WithdrawalTest
{
    private Withdrawal withdrawal;
    private Keypad keypad;
    private Screen screen;
    private BankDatabase bankDatabase;
    private CashDispenser cashdispenser;

    /**
     * Default constructor for test class WithdrawalTest
     */
    public WithdrawalTest()
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
        keypad = new Keypad();
        screen = new Screen();
        bankDatabase = new BankDatabase();
        cashdispenser = new CashDispenser();
        withdrawal = new Withdrawal(12345,screen, bankDatabase,keypad,cashdispenser );
         
        
        
    }
    
    @Test
    public void testDisplayMenuOfAmounts_Test13() {
        //Se ingresa 1, devuelve un entero 20
        assertEquals(20, withdrawal.displayMenuOfAmounts());
    }
    @Test
    public void testDisplayMenuOfAmounts_Test14() {
        //Se ingresa 2, devuelve un entero 20
        assertEquals(40, withdrawal.displayMenuOfAmounts());
    }
    @Test
    public void testDisplayMenuOfAmounts_Test15() {
        //Se ingresa 3, devuelve un entero 20
        assertEquals(60, withdrawal.displayMenuOfAmounts());
    }
    @Test
    public void testDisplayMenuOfAmounts_Test16() {
        //Se ingresa 4, devuelve un entero 20
        assertEquals(100, withdrawal.displayMenuOfAmounts());
    }
    @Test
    public void testDisplayMenuOfAmounts_Test17() {
        //Se ingresa 5, devuelve un entero 20
        assertEquals(200, withdrawal.displayMenuOfAmounts());
    }
    @Test
    public void testDisplayMenuOfAmounts_Test18() {
        //Se ingresa 6, devuelve un entero 20
        assertEquals(6, withdrawal.displayMenuOfAmounts());
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
