import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ additionTest.class, OperationIntegrationTest.class })

public class suiteTest {

    @Test
    public void testAdditionPass() {
        OperationsTest.testPerformSubtraction("15","5","10");
    }
}