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
        // Exceptions Hierarchy 
        // Object ->Throwable -> Exception ->RuntimeException ->NumberFormatException
        // second catch block of different exception type
        // *** after JAVA 7 you can have multiple excpetion types in a single catch
        // using the | (Logical OR)
        
        try {
         getInt();
        }
        catch (NumberFormatException nfe) {
            System.out.println("not a valid input. the error was: " + nfe);
            
        }
        catch (NullPointerException npe){
            System.out.println("you have a null pointer exception");
        }
       
        
      
    }
     private static int getInt(){
        int x = Integer.parseInt("Spyros332");
         System.out.println("the number from string is: "+x);
         return x;
    }
   
}
