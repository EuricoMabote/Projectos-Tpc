
import Exercicio1.ClasseMetodos;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 */

/**
 *
 * @author Eurico PC
 */
public class Numero2 {
    
    static Scanner entrada;
    
    
    
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        

        
        
        
        System.out.println("Introduza o numero total dos alunos");
        int N=entrada.nextInt();
        
        String[][] alunos=new String[N][5];
        String[][] notasCadaAluno=new String[N][5];
        
        for(int i=0;i<N;i++)
            for(int j=0;j<4;j++){
                if(j==0)
                    
                 
                System.out.println("Inroduza o nome do aluno "+(i+1));
                else System.out.println("Introduza a nota: "+j);
                
              
                
                
                
            String inp=entrada.next();
            alunos[i][j]=inp.trim();
            }

       
        Vector<Integer> notas=new Vector();
        /**
         * Captura notas dos alunos
         */
           for(int i=0;i<N;i++)
            for(int j=0;j<4;j++){
                if(j!=0)
                    notas.add(Integer.parseInt(alunos[i][j]));
       
            }
           
           Double media=ClasseMetodos.media(notas); //calcular a media da turma
         
           
           JOptionPane.showInputDialog(null, "A media do e: "+media);
           
}
}