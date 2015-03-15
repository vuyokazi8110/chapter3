/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import junit.framework.Assert;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import services.CRUD.BookInterface;
import services.CRUD.impl.BookInterfaceImpl;

/**
 *
 * @author sbm
 */
public class BookTest2 {
    //Map
    BookInterface books;
    
    public BookTest2() {
    }
    
    @Before
    public void setUp() {
        books = new BookInterfaceImpl();
        books.add(435345, "Romeo");
        books.add(555666, "Mcberth");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testBooks() {
    Assert.assertEquals("{435345=Romeo,555666= Mcberth}",books.View());
    }
}
