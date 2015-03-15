/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import services.CRUD.LecturersInterface;
import services.CRUD.impl.LecturersInterfaceImpl;

/**
 *
 * @author sbm
 */
public class TestSet {
    LecturersInterface mylist;
    
    public TestSet() {
    }
    
    @Before
    public void setUp() {
        //to create lecturers impl
        mylist = new LecturersInterfaceImpl();
        mylist.add("name");
        mylist.add("emailaddress");
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testSet() {
    Assert.assertEquals("[name, emailaddress]", mylist.view);
    
    }
}
