
package br.edu.fatecfranca.ads;

import javax.swing.JOptionPane;

public class TestarRio {

    public static void main(String[] args) {
        // entrada de dados com input
        String nomeDoRio = JOptionPane.showInputDialog("Informe nome do Rio");
        float nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe nivel atual"));
        int aux = JOptionPane.showConfirmDialog(null, "O rio está poluido ?",
                "O rio está poluido ?",JOptionPane.YES_NO_OPTION);
        boolean estado = aux == JOptionPane.YES_OPTION;
        // Criando Objetos      
        Rio rio01 = new Rio (nomeDoRio,nivel,estado);
        Rio rio02 = new Rio();
        // Usando metodos
        rio01.ensolarar(2000);
        rio01.chover(200);

        // Definindo caracteristicas objeto 02
        //rio02.nome = "Tiete";
        //rio02.nivel = 5000;
        //rio02.poluido = true;
        //usando metodos objeto 02
        rio02.ensolarar(3000);
        rio02.chover(2500.50f);
        rio02.limpar();
        // mostrando mensagem na tela
        JOptionPane.showMessageDialog(null, rio01.mostrar());
        JOptionPane.showMessageDialog(null, rio02.mostrar());
        
        
        
    }
    
}
