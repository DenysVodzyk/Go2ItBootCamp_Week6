import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingAccountTest {

    @Test
    public void withdrawTest() {
        Account savingAccountTest = new SavingAccount(1, "owner", 1000, 100);
        boolean resultTest = savingAccountTest.withdraw(100);
        assertTrue(resultTest);
    }

    @Test
    public void withdrawTest2() {
        Account savingAccountTest = new SavingAccount(1, "owner", 1000, 100);
        boolean resultTest = savingAccountTest.withdraw(999);
        assertFalse(resultTest);
    }


}
