
package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class TestarRio {

    public static void main(String[] args) {
        Rio rio01 = new Rio ("Rio das Velhas",12000,false);
        Rio rio02 = new Rio();
        
        rio01.ensolarar(2000);
        rio01.chover(200);
        rio01.sujar();
        
        rio02.nome = "Tiete";
        rio02.nivel = 5000;
        rio02.poluido = true;
        
        rio02.ensolarar(3000);
        rio02.chover(2500.50f);
        rio02.limpar();
        
        JOptionPane.showMessageDialog(null, rio01.mostrar());
        JOptionPane.showMessageDialog(null, rio02.mostrar());
        
        
        
    }
    
}
