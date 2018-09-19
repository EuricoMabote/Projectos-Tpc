/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Eurico Fabiao Mabote
 */
public class Estatistica {
    
    
    static Scanner ler;
    
    
     public static void main(String []args){
         
        ler =new Scanner(System.in);
        
        
         Integer [] val = {8,1,2,2,3,3,3,6,6,6,6,3,8,8};
         
        Vector<Integer> vector=new Vector();
        for(Integer inte: val){
            vector.add(inte);
        
    }
        //vector
        
        System.out.println("A media é " +ClasseMetodos.media(vector));
        
       }
    
}
