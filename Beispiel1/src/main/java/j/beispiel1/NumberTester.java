/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.beispiel1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class NumberTester {
   String fileName;
   NumberTest primeTester;
     NumberTest palindromeTester;
      NumberTest oddTester;
     
    public NumberTester(String fileName){
        this.fileName = fileName;
    }
    
    public void setOddEvenTester(NumberTest oddTester){
        
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
        
    }
    
    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() {
        setOddEvenTester(number -> number % 2 != 0);
        setPrimeTester(number -> {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++)
        { if (number % i == 0) {  
            return false; 
        
        } } return true;
        });
        
        
       try (
           BufferedReader reader =
                   new BufferedReader(new FileReader(fileName))){
           
          int rowNumb = Integer.parseInt(reader.readLine());
          
          int action;
          int numberToProve;
          while(reader.readLine() != null){
              String zeile = reader.readLine();
              String[] parts = zeile.split(" ");
              int one = Integer.parseInt(parts[0]);
               int second = Integer.parseInt(parts[1]);
               
               switch(one){
                   case 1:
                      System.out.println( "Zahl ist: ");
                      break;
                   case 2:
                        System.out.println( "Zahl ist: ");
                        break;
                   case 3:
                        System.out.println( "Zahl ist: ");
                       
               }
               
              
          }
           
       } catch (FileNotFoundException ex) {
           Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }
    
    
}
