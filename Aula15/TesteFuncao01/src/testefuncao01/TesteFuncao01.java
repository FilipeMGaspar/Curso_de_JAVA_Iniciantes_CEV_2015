/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author user
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){
        int soma = a+ b;
        System.out.println("A soma de "+ a +" com "+ b + " tem o valor de "+soma);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5, 2);
    }
    
}
