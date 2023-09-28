package pl.devfoundry.testing;

import org.example.Item;
import org.example.Orders;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ItemTest {


    @Test
    public void checkIfordersHaSomething(){
        Item newItem = new Item("sus","my house","me",2,4,2);
        assertNotNull("userId is empty",newItem);

    }
    @Test
    public void checkifThatMethodsWorks(){
        Item newItem = new Item("sus","my house","me",2,4,2);
        assertNotNull("userId is empty",newItem);
        assertTrue("triangle dosen't work.",newItem.printNo());
        assertTrue("triangle dosen't work.",newItem.printYes());
        assertTrue("triangle dosen't work.",newItem.printIranOutOfIdeas());

    }
}
