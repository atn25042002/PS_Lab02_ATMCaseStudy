package src.main;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/**
 * The test class BankDatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BankDatabaseTest extends TestCase
{
    private BankDatabase bankDatabase;
    /**
     * Default constructor for test class BankDatabaseTest
     */
    public BankDatabaseTest()
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
        bankDatabase = new BankDatabase();
    }
    
    public void testAuthenticateUser_Test01(){
        //Cuenta y pin correctos
        int accountNumber= 12345;
        int pin= 54321;
        assertEquals(true, bankDatabase.authenticateUser(accountNumber, pin));
    }
    
    public void testAuthenticateUser_Test02(){
        //Cuenta incorrecta y pin correcto
        int accountNumber= 11111;
        int pin= 54321;
        assertEquals(false, bankDatabase.authenticateUser(accountNumber, pin));
    }
    
    public void testAuthenticateUser_Test03(){
        //Cuenta correcta y pin incorrecto
        int accountNumber= 12345;
        int pin= 55555;
        assertEquals(false, bankDatabase.authenticateUser(accountNumber, pin));
    }
    
    public void testAuthenticateUser_Test04(){
        //Cuenta y pin incorrectos
        int accountNumber= 11111;
        int pin= 5555;
        assertEquals(false, bankDatabase.authenticateUser(accountNumber, pin));
    }
    
    public void testGetAvailableBalance_Test09(){
        //Comprobando la correcta obtención del saldo disponible de la cuenta
        int accountNumber= 12345;
        assertEquals(1000.0, bankDatabase.getAvailableBalance(accountNumber));
    }
    
    public void testGetTotalBalance_Test10(){
        //Comprobando la correcta obtención del saldo total de la cuenta
        int accountNumber= 12345;
        assertEquals(1200.0, bankDatabase.getTotalBalance(accountNumber));
    }
    
    public void testDebit_Test25(){
        //Comprobando saldo disponible después de un retiro
        int userAccountNumber= 12345;
        double amount = 200;
        bankDatabase.debit(userAccountNumber, amount);
        assertEquals(800.0, bankDatabase.getAvailableBalance(userAccountNumber));
    }
    
    public void testDebit_Test26(){
        //Comprobando saldo total después de un retiro
        int userAccountNumber= 12345;
        double amount = 200;
        bankDatabase.debit(userAccountNumber, amount);
        assertEquals(1000.0, bankDatabase.getTotalBalance(userAccountNumber));
    }
    
    public void testCredit_Test36(){
        int userAccountNumber= 12345;
        //Comprobando saldo total después de un depósito
        double amount = 200;
        bankDatabase.credit(userAccountNumber, amount);
        assertEquals(1400.0, bankDatabase.getTotalBalance(userAccountNumber));
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

