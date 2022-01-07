/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author Spyros
 */
public class LessonExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a try catch block
        try {
         int x = Integer.parseInt("Spyros332");
         System.out.println("the number from string is: "+x);
        }
        catch (NumberFormatException nfe) {
            System.out.println("not a valid input");
        }
    }
    
}
