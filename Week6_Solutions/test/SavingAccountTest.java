import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SavingAccountTest {

    @Test
    public void withdrawTest() {
        SavingAccount savingAccountTest = new SavingAccount(1, "owner", 1000, 100);
        boolean resultTest = savingAccountTest.withdraw(100);
        assertTrue(resultTest);
    }

    @Test
    public void withdrawTest2() {
        SavingAccount savingAccountTest = new SavingAccount(1, "owner", 1000, 100);
        boolean resultTest = savingAccountTest.withdraw(999);
        assertEquals(false, resultTest);
    }


}
