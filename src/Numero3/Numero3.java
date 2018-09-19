/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero3;

import javax.swing.JOptionPane;

/**
 *
 * @author Eurico Mabote
 */
public class Numero3 {
    
    public static void main(String[] args) {
        
        boolean [] vector1={true,true, true, false ,true,false};
        boolean [] vector2={true,false, false, false ,true,false};
       
        int j=0;
        for(int i=0;i<vector1.length;i++)
            if(vector1[i]==vector2[i])
                j++;
        
        
        
        if(j!=vector1.length) JOptionPane.showMessageDialog(null, " Os vectores dados sao DIFERENTES"," Eurico TPC",JOptionPane.INFORMATION_MESSAGE);
            
          
        else JOptionPane.showMessageDialog(null, " Os vectores dados sao IGUAIS ","Eurico TPC",JOptionPane.INFORMATION_MESSAGE);;
    }
    
    
}
