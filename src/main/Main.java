package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Borges
 */
public class Main {
    public static void main(String[] args) {
        int opContinuar = 0;
        
        do {
            String novaconta = JOptionPane.showInputDialog(null,
                    "Deseja realizar uma nova operação?\n[1] Sim\n[0] Não");
            
            opContinuar = Integer.parseInt(novaconta);
            
        } while (opContinuar != 0);        
    }    
}
