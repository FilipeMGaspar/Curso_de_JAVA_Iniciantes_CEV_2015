/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
       //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
       //JOptionPane.showMessageDialog(null,"Você digitou o valor "+ n);
       int n, s = 0, conta = 0;
       int totPares = 0, totImpares = 0;
       double media;
       do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número <br> número <strong>0</strong> <em>para parar!</em></html>"));
            s += n;
            
            if(n != 0){
                conta++;
            }
            
            if((n%2 == 0) && (n != 0)){
                totPares++;
            }else if((n%2 !=0) && (n != 0)){
               totImpares++;
            }
            
       }while(n != 0);
       media = s / conta;
       JOptionPane.showMessageDialog(null,"<html>Resultado Final"
                                    + "<br> ---------------------------<br>"
                                    +"Número de entradas:  "+ conta
                                    +"<br>Total de números pares: "+totPares
                                    +"<br>Total de números impares: "+totImpares
                                    + "<br>Soma dos valores:  " +s 
                                    +"<br> Média dos valores: "+ media
                                    + "</html>");
    }
    
}
