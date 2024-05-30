package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DepositTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DepositTest
{
    private Deposit deposit;
    private Keypad keypad;
    private Screen screen;
    private BankDatabase bankDatabase;
    private DepositSlot depositSlot;
    /**
     * Default constructor for test class DepositTest
     */
    public DepositTest()
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
        depositSlot = new DepositSlot();
        deposit = new Deposit(12345, screen, bankDatabase, keypad, depositSlot);
        
        
    }
    @Test
    public void testPromptForDepositAmount_test31() {
        //Se ingresa un monto de 100, el cual se debe convertir a 1.00, prueba validad
        assertEquals(1.00, deposit.promptForDepositAmount());
    }
    @Test
    public void testPromptForDepositAmount_test32() {
        //Se ingresa un monto de 0, es convertido a 0, prueba valida
        assertEquals(0, deposit.promptForDepositAmount());
    }
    @Test
    public void testPromptForDepositAmount_test33() {
        /*Se ingresa un  monto negativo -500, prueba invalida. El monto convertido
        /debe ser 0*/
        assertEquals(0, deposit.promptForDepositAmount());
    }
    @Test
    public void testPromptForDepositAmount_test34() {
        //Se ingresa un monto de 1000000, debe ser convertido a 10000.00, prueba validad
        assertEquals(10000.00, deposit.promptForDepositAmount());
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
