package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    //para verficar la salida en el metodo void
    

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
    
    @Test
    public void testExecute_Test19() {
        // Get the output from the execute method
        //the amount es 10000
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; 
        System.setOut(new PrintStream(outContent));
        
        bankDatabase.credit(12345, 1000); 
        
        withdrawal.execute();
        String output = outContent.toString().trim();
        System.out.println("Esto captura: " +output);
        

        // Assert that the output matches the expected output
        assertTrue(output.contains("Your cash has been" + " dispensed. Please take your cash now."));
        //assertEquals("\nYour cash has been" + " dispensed. Please take your cash now.", output);
    }
     @Test
    public void testExecute_Test20() {
        
        bankDatabase = new BankDatabase();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; 
        System.setOut(new PrintStream(outContent));
         
        
        withdrawal.execute();
        String output = outContent.toString().trim();
        System.out.println("Esto captura: " +output);
        

        // Assert that the output matches the expected output
        assertTrue(output.contains("Your cash has been" + " dispensed. Please take your cash now."));
        //assertTrue(output.contains("Insufficient funds in your account." + "Please choose a smaller amount."));
        //assertEquals("\nYour cash has been" + " dispensed. Please take your cash now.", output);
    }
     @Test
    public void testExecute_Test21() {
        // Get the output from the execute method
        //the amount es 10000
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; 
        System.setOut(new PrintStream(outContent));
        
        bankDatabase.credit(12345, 100);
        
        withdrawal.execute();
        String output = outContent.toString().trim();
        System.out.println("Esto captura: " +output);
        

        // Assert that the output matches the expected output
        assertTrue(output.contains("Your cash has been" + " dispensed. Please take your cash now."));
        //assertEquals("\nYour cash has been" + " dispensed. Please take your cash now.", output);
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
