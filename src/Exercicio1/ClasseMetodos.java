/*
 *Criacao da Classe com metodos principais
 .
 */
package Exercicio1;

import java.util.Arrays;
import java.util.Vector;

/**
 * @author Eurico Fabiao Mabote
 */
public class ClasseMetodos {
    
    
   public static double media(Vector<Integer> vector){
        double resultado;
        int soma=0;
        for(int i=0;i<vector.size();i++)
            soma+=vector.get(i);
         resultado=soma/vector.size();
        return resultado;    
    }
   
   
      public static int moda(int [] vector){
       int [] adicao=new int[vector.length]; //Vector que armazena o numero mais repetido no vector do parametro
       int [] vector2=new int[vector.length]; //para clonar o vector do parametro para que se possa fazer a comparacao dos elementos
        vector2=vector.clone();  //criar uma copia do vector original
       
        /**
         * Captacao de inteiros 
         * verificacao de repeticao 
         */
        for(int i=0;i<vector.length;i++)
            for(int j=0;j<vector.length;j++){
                if(vector[i]==vector2[j]){
                    adicao[j]+=1;
                            }}
     /**
         * Verificao do maior inteiro
         */
        int maior=-1;
        for(int i=0;i<adicao.length;i++){
            if(adicao[i]>maior)
                maior=adicao[i];
        }
       
       /**
        * esta estrutura verifica a posicao do maior elemento do array adicao
        * que por sua vez sera igual a posicao de um dos numeros mais repetidos
        */
        int posicao=0;
        for (int i=0;i<adicao.length;i++){
            if(adicao[i]==maior){
//                System.out.println(i);
                posicao=i;
                
            }
        }
       return vector[posicao];  // retorna a moda
        }
    
          public static void mediana(){
              
    
          }
    
    public static int mediana(int []vector){
        Arrays.sort(vector);
        int resultado=vector.length/2;
        return vector[resultado-1];
       
    }
}
