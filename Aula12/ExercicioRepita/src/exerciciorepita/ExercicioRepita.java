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
       int n, s=0, conta = 0;
       double media;
       do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número <br> número <strong>0</strong> <em>para parar!</em></html>"));
            s += n;
            if(n != 0){
                conta++;
            }
       }while(n != 0);
       media = s / conta;
       JOptionPane.showMessageDialog(null,"<html>Resultado Final"
                                    + "<br> ----------------------<br>"
                                    + "Somatório =  " +s 
                                    +"<br> Média = "+ conta
                                    + "</html>");
    }
    
}
