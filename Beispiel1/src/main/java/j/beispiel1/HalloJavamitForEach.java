/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.beispiel1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class HalloJavamitForEach {
   
    
    
    public static void main(String[] args){
       ArrayList<String> list = new ArrayList<>();
        list.add("Ried");
        list.add("Linz");
        list.add("Wels");
        
        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        list.forEach((String s) -> System.out.println(s));
    }
    
}
