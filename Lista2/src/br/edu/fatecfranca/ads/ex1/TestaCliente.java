
package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;


public class TestaCliente {

   
    public static void main(String[] args) {
        //Criando Objetos
        Cliente cliente01 = new Cliente ();
        
        cliente01.setNome ("Fulano");
        cliente01.realizarDeposito(1000);
        cliente01.realizarSaque(500);
        
        
        JOptionPane.showMessageDialog(null, cliente01.toString());
        
        Cliente cliente02 = new Cliente ();
        
        cliente02.setNome ("Fulanodsasbvdsavdgasvdgvsagdvsagdvga");
        cliente02.realizarDeposito(10);
        cliente02.realizarSaque(500);
        
          // sem o get e set da erro.
        
        JOptionPane.showMessageDialog(null, cliente02.toString());
        
        String nmroConta = JOptionPane.showInputDialog("Informe nuemro da conta");
        String nmroAgencia = JOptionPane.showInputDialog("Informe numero da Aência");
        String nome = JOptionPane.showInputDialog("Informe o nome");
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo"));
        
         Cliente cliente00 = new Cliente (nmroConta,nmroAgencia,nome,saldo);
         JOptionPane.showMessageDialog(null, cliente00.toString());
        
    }
    
}
