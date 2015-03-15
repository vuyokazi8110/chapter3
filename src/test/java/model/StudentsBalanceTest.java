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
public class StudentsBalanceTest {
    
    public StudentsBalanceTest() {
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
    public void TestSTudentBalance() {
    StudentBalance studB = new StudentBalance.Builder("205166652").payment(20.00).build();
    Assert.assertEquals(studB.getstudId(),"205166652");
    Assert.assertEquals(studB.getPayment(),20.00);
        
    }
    @org.testng.annotations.Test
    
    public void UpdateStudentBalance(){
        
    StudentBalance studB = new StudentBalance.Builder("205166652").payment(20.00).build();
    StudentBalance studB2 = new StudentBalance.Builder("20102345").payment(25.00).studentBalance.build();
   
    Assert.assertEquals(studB2.getstudId(),"20101234");
    Assert.assertEquals(studB2.getPayment(), 25.00);
    
    
    }
    
}
