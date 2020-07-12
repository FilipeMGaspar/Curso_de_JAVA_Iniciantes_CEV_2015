/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritemeticos;

/**
 *
 * @author user
 */
public class OperadoresAritemeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 =3;
        int n2 =5;
        float m =(n1+n2)/2;
        System.out.println("A média é igual a "+ m);
        
        int numero = 10;
        //numero++;
        int valor = 4 + numero--;
        System.out.println("Valor  " + valor);
        System.out.println("Número com pos decremento "+ numero);
        
        int x = 4;
        x *= 2;
        System.out.println("X = "+x);
        
        float tst = 25;
        float result = (float) Math.sqrt(tst);
        System.out.println("Raiz quadrada de "+tst+" é "+result);
    }
    
}
