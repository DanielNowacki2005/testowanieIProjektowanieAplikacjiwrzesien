package pl.devfoundry.testing;
import org.example.Orders;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.Test;
import static org.junit.Assert.*;
public class OrdersTest {
    @Test
    public void checkIfordersHaSomething(){
        Orders newOrder = new Orders(2,2,2,2,4,2);
        assertNotNull("userId is empty",newOrder);

    }
    @Test
    public void checkifThatMethodsWorks(){
        Orders newOrder = new Orders(2,2,2,2,4,2);
        assertNotNull("userId is empty",newOrder);
        assertTrue("triangle dosen't work.",newOrder.printIluminati());
        assertTrue("triangle dosen't work.",newOrder.printSquare());
        assertTrue("triangle dosen't work.",newOrder.addTime1());

    }
}
