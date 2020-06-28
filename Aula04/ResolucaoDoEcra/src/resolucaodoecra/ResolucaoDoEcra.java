
package resolucaodoecra;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoDoEcra {

    public static void main(String[] args) {
        // Resolução do ecrã
        Toolkit tk = Toolkit.getDefaultToolkit();//Caixa de ferramentas para obtre a resolução do ecrã
        Dimension d = tk.getScreenSize();//Obtem as dimensões do ecrã
        System.out.println("A resolução do seu Monitor é: " +d.width + " x " +d.height);
        
    }
    
}
