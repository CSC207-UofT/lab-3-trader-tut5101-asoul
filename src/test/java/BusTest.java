import org.junit.*;

import static org.junit.Assert.*;

public class BusTest {
    Bus bus;

    @Before
    public void setUp(){
        bus = new Bus(100, 50);
    }

    @Test(timeout = 50)
    public void TestUpGradeSpeed() {
        bus.upgradeSpeed();
        assert bus.getMaxSpeed() == 200;
    }

    @Test(timeout = 50)
    public void TestDownGradeSpeed() {
        bus.downgradeSpeed();
        assert bus.getMaxSpeed() == 0;
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assert bus.getPrice() == 50;
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assert bus.getMaxSpeed() == 100;
    }

    }
