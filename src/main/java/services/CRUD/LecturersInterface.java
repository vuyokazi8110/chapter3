/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sbm
 */
public interface LecturersInterface {
    Set mylist = new HashSet();
    public Object view();
    public void add(String item);
    //public String view();
    
}
