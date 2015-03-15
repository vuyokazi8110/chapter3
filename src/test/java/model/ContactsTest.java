/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sbm
 */
public class ContactsTest {
    
    public ContactsTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
   public void testContacts() {
       
         Contact con = new Contact.Builder("vwonwo@yahoo.com").TelNumber("0839750752").build();
         Assert.assertEquals(con.getTelNumber(),"0839750752");
         Assert.assertEquals(con.getEmail(), "vwonwo@yahoo.com");   
   }
   
   @org.testng.annotations.Test
    public void ContactTestUpdate() 
    {
        Contact con = new Contact.Builder("Romeo@yahoo.com").TelNumber("86767678778").build();
        Contact con2 = new Contact.Builder("Romfggfhghgeo@yahoo.com").email(con).TelNumber("4432-5435").email(con).build();
        Assert.assertEquals(con2.getTelNumber(),"4432-5435");
        Assert.assertEquals(con2.getEmail(), "Romeo@yahoo.com");
       
    }
}
