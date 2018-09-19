
package Exercicio1;


import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Eurico Fabiao Mabote
 */
public class ClasseModa {
    
    
     public static void main(String []args){

 int [] vector={1,2,2,3,4,5,7,7,7,7,7,8,9,11};
        
  
         
          JOptionPane.showMessageDialog(null, "O elemento mais repetido ou a moda e' : "+ClasseMetodos.moda(vector)+"","Eurico Mabote",JOptionPane.INFORMATION_MESSAGE);
          
          
    }
     
}