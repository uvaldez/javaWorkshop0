/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic;

/**
 *
 * @author ujvaldez
 */
public class ApplicationStart {
    public static void main(String[] args)
    {
        System.out.println("This is the Application Start");
        Demo ourNewObj = new Demo();
        
        ourNewObj.someMethod();
        
        //method with parameters
        ourNewObj.someMethodWithParameters(11,"Uziel Valdez");
        //in java we defined the type of the variable first then the name then the value
        String ourNewString = "something";
        int ourNewInt = 10;
        ourNewObj.someMethodWithParameters(ourNewInt,ourNewString);
        
        //public variables accesing from applicationStart
        System.out.println("Public variable in Demo class is: "+ourNewObj.pdemo);
        
        //Using getter function to get the private variables
        System.out.println("The value for privateDemo using getter function is: "+ourNewObj.getPrivateDemo());
        
        //testing static variables
        Demo ourNewObj2 = new Demo();
        Demo ourNewObj3 = new Demo();
    }
}
