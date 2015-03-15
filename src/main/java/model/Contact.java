/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author sbm
 */
public class Contact {
    private String email;
    private String TelNumber;
    private String address;
    private float amount;

    private Contact(Builder build) {
    email= build.email;
    TelNumber = build.TelNumber;
    address = build.address;
    amount = build.amount;
 
    }
    
    public static class Builder{
        
        private String email;
        private String TelNumber;
        private String address;
        private float amount;
        
        public Builder (String email)
        {
            this.email=email;
        }
        
        public Builder TelNumber(String amount)
        {
            this.TelNumber = amount;
            return this;
        }
         public Builder address(String address)
        {
            this.address = address;
            return this;
        }
          public Builder amount(float amount)
        {
         //   this.amount = amount();
            return this;
        }
        public Builder email(Contact con)
        {
            this.email = con.getEmail();
            return this;
        }
        
       
        public Contact build()
        {
            return new Contact(this);
        }
    }
    public float getTelNumber() {
      //  return TelNumber;
    }

    public String getAddress() {
        return address;
    }
    
    public String getEmail() {
        return email;
    }
    
}
