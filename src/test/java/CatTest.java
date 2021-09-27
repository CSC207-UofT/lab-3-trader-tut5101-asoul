import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat c;
    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound(){
        assertEquals("Nya!", c.sound());
    }
    @Test(timeout = 50)
    public void TestPrice(){
        assertEquals(1000, c.getPrice());
    }
}
