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
        // ***  Finally exercise . what will print ?
        
        
        System.out.println("Try the finally statement. It will print "+getInt());
        
      
    }
     private static int getInt(){
        try {
         return 50;
        }
        catch (NumberFormatException nfe) {
            return 100;
        }
        finally{ 
         return 200;
    }
     }
}
