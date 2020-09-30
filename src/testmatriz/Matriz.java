/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatriz;

/**
 *
 * @author anton
 */
public class Matriz {
    public void armar(){
        
        int matriz[][] = new int [4][];
        matriz[0] = new int [4];
        matriz[1] = new int [3];
        matriz[2] = new int [5];
        matriz[3] = new int [2];
        
        int i=3;
        
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz[f].length;c++){
                matriz[f][c] = i;
                i+=3;
                System.out.println (matriz[f][c]);
            }
        }
        
        for(int f=0;f<matriz.length;f++){
            for(int c=0;c<matriz[f].length;c++){
              if  (matriz[f][c] %2 ==0){
                System.out.println("Los numeros pares de la matriz son:"+matriz[f][c]);
            }
        }
    }
}
}