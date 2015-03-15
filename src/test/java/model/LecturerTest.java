/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sbm
 */
public class LecturerTest {
    
    public LecturerTest() {
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
   public void testme()
    {
         Lecturers lect = new Lecturers.Builder("vwondo@fnb.co.za").lname("Veeka").lsurname("Wondo").build(),
         Assert.assertEquals(cont.getlname(),"Vuyokazi");
         Assert.assertEquals(cont.getempNumber(), "205166652");   
    }
   
   @Test
    
    public void LecturersTestUpdate()
    {
        Lecturers lect = new Lecturers.Builder("205166652").lsurname.build();
        Lecturers lect2 = new Lecturers.Builder("2020206").empNumber.lsurname)("Bert");.Build();
        Assert.assertEquals(lect2.getempNumber(),"4432-5435");
        Assert.assertEquals(lect2.getlsurname(), "Romeo");
    }
}
