/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvaldez.tutorials.basic;

/**
 *
 * @author ujvaldez
 */
public class Demo {
    
    //public variables
    public String pdemo = "Hi i'm public!";
    //private variables
    private String privateDemo = "Hi i'm private";
    //final variables means that it can only be asigned once
    public final String finalDemo = "something in final";
    //Static variables
    public static int staticDemo = 0;
    
    //Constructor
    public Demo()
    {
        staticDemo++;
        System.out.println("Demo instatiated... i'm number: "+staticDemo);
    }
    
    //constructor with parameters
    public Demo(int counter)
    {
        System.out.println("I'm the constructor with parameters.... parameter is: "+counter);
    }
    public void someMethod()
    {
        System.out.println("This is someMethod called");
    }
    
    public void someMethodWithParameters(int arg0, String arg1)
    {
       //local variables:
        int counter = 0;
        System.out.println("This is someMethod called with parameter: "+arg1+" and "+arg0);
    }    
    
    
    //if we want to acces to the private variables we are going to use the getters and setters
   //Getter:
    public String getPrivateDemo()
    {
        return privateDemo;
    }
    
    //Setter
    public void setPrivateDemo(String value)
    {
        privateDemo = value;
    }
}
