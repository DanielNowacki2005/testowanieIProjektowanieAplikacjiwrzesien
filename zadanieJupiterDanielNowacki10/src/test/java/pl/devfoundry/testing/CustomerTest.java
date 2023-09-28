//User and Customer are one and the same
package pl.devfoundry.testing;

import org.example.Customer;
import org.example.Orders;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void checkIfNotActiveWhenNotActive(){
        //given
        Customer newCustomer = new Customer( "Daniel",  "Nowacki","Polska", "amongus", "sus", 22423, 0, true);
        newCustomer.setActive(false);
        assertFalse("check if new customer is active",newCustomer.isActive());

        System.out.println("użytkownik nie jest aktywny");
    }
    @Test
    public void checkIfActiveAfterActivation(){
        //given
        Customer newCustomer = new Customer( "Daniel",  "Nowacki","Polska", "amongus", "sus", 22423, 0, true);
        newCustomer.setActive(false);
        assertFalse(newCustomer.isActive());
        //when
        newCustomer.activate();
        assertTrue("check if new customer is active",newCustomer.isActive());
    }
    @Test
    public void checkUserIdInOrderIsTheSameAsInnewUser(){
        Customer newCustomer = new Customer( "Daniel",  "Nowacki","Polska", "amongus", "sus", 22423, 0, true);
        newCustomer.setActive(false);
        assertFalse(newCustomer.isActive());
        //when
        newCustomer.activate();
        assertTrue("check if new customer is active",newCustomer.isActive());
        //then
        Orders order = newCustomer.createOrder(newCustomer.getUserId(), 12,2,2,23,21);
        assertEquals("coś jest nie tak z user-id", order.getUserId(), newCustomer.getUserId());
    }
}
