package ua.lviv.iot;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;



public class PhotographerTest extends TestCase {
    private Photographer shop = null;

    @BeforeEach
    protected void setUp() {
        shop = new Photographer();
        shop.addDevices(new Tripod(2, 7,
                " plastic", "canon", 2));
        shop.addDevices(new Tripod(2, 7,
                " plastic", "canon", 2));
        shop.addDevices(new Powerbank(6, 4,
                " plastic", "nicon", 3));
        shop.addDevices(new Powerbank(6, 4,
                " plastic", "nicon", 3));
        shop.addDevices(new Camera(5, 6,
                " plastic", "leika", 5));
        shop.addDevices(new Camera(5, 6,
                " plastic", "leika", 5));


    }

    @Test
    public void testFindByGroup() {
        List<Devices> result = shop.findByGroup(Kindjob.VIDEO);
        assertEquals(4, result.size());
    }
    @Test
    public void testSortDevicesByWeight() {

        List<Devices> testList = shop.getDevicesList();


        testList = shop.sortDevicesByWeight(testList);

        assertEquals(4, testList.get(0).getWeight());
        assertEquals(4, testList.get(1).getWeight());
        assertEquals(6, testList.get(2).getWeight());
        assertEquals(6, testList.get(3).getWeight());
        assertEquals(7, testList.get(4).getWeight());
        assertEquals(7, testList.get(5).getWeight());

    }




}




