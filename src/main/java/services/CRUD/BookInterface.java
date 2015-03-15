/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services.CRUD;

/**
 *
 * @author sbm
 */
public interface BookInterface {
    
    public void add(int ISBN, String BookName);
    public String View();
    
}
