/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author user
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 8, 7, 5, 4};
        // System.out.println("Número de indices (Registos): "+ n.length);
        for (int i=0; i <= n.length-1; i++){
            System.out.println("Na Posição "+ i +" Temos o valor: "+n[i]+ " ");
        }
    }
    
}
