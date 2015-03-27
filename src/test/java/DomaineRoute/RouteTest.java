package DomaineRoute;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RouteTest {

    public static Route route;
    @Before
    public void setUp() throws Exception {
        route = new Route(10,500);
    }

    @Test
    public void testGetters() {
        assertEquals(10,route.getLargeur());
        assertEquals(500,route.getLongueur());
    }
}