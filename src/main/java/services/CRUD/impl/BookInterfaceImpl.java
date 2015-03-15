/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD.impl;

import java.util.HashMap;
import java.util.Map;
import services.CRUD.BookInterface;

/**
 *
 * @author sbm
 */
public class BookInterfaceImpl implements BookInterface {
    private Map BookInterface1 = new HashMap();
    public void add(String ISBN, String BookName) {
        BookInterface1.put(ISBN, BookName);
    }

    public String View() {
        
        return BookInterface1.toString();
    }
    
    
    
}
