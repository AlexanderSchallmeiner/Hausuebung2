/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.beispiel1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
    
    public void testFile(){
     
        Scanner scan = null;
        try {
            scan = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
    
}
