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
public class BooksTest {
    
    public BooksTest() {
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
     @org.testng.annotations.Test
     public void testBooks() 
     {
         Books book = new Books.Builder("4432-5435").bookname("Romeo").build();
         Assert.assertEquals(book.getIsbn(),"4432-5435");
         Assert.assertEquals(book.getBookName(), "Romeo");
                  
     }
    
    @Test
    public void testBooksUpdate() 
     {
        
         Books book = new Books.Builder("4432-5435").bookname("Romeo").build();
         Books book2 = new Books.Builder("99999-99998").books(book).bookname("Juliet").books(book).build();
         Assert.assertEquals(book2.getIsbn(),"4432-5435");
         Assert.assertEquals(book2.getBookName(), "Romeo");
     }

}
