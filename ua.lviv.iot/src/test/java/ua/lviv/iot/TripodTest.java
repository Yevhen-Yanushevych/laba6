package ua.lviv.iot;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static ua.lviv.iot.Kindjob.PHOTO;
import static ua.lviv.iot.Kindjob.VIDEO;


public class TripodTest extends TestCase {

    @Test
    public void testGetKindjob() {assertEquals(new Tripod(6, 4,
                    " plastic", "nicon", 3)
                    .getKindjob().toString(),
            PHOTO.toString());
    }


}