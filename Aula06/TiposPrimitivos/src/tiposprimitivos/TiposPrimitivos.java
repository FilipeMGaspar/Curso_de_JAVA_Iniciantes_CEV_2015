/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Indique a nota obtida: ");
        float nota = teclado.nextFloat();
        //System.out.print("A nota é: " + nota);
        System.out.println("A nota é: " + nota);
        
        System.out.printf("A nota de %s é %.2f\n",nome, nota);    
        
        nome = "Nélia";
        nota = 3.5f;
        System.out.format("A nota de %s é %.2f\n",nome, nota);
    }
}
