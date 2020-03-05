    
package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;


public class TestaCliente {

  
    public static void main(String[] args) {
        //Criando Objetos
        Cliente fulano = new Cliente ();
        
        fulano.setNome("Tobias");
        fulano.realizarDeposito(1000);
        fulano.realizarSaque (500);
        
        //JOptionPane.showMessageDialog(null,fulano.getNome());
        JOptionPane.showMessageDialog(null, fulano.toString());
       
        Cliente Beltrano = new Cliente ();
        
        Beltrano.setNome ("Beltrano");
        Beltrano.realizarDeposito(10);
        Beltrano.realizarSaque(500);
        
          // sem o set nao e possivel acessar as variaveis privadas,
          // e sem o get nao temos como retornar um valor especifico, nos dois casos ocorre erro.
        
        JOptionPane.showMessageDialog(null, Beltrano.toString());
        
        String nmroConta = JOptionPane.showInputDialog("Informe nuemro da conta");
        String nmroAgencia = JOptionPane.showInputDialog("Informe numero da Agência");
        String nome = JOptionPane.showInputDialog("Informe o nome");
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo"));
        
         Cliente cliente00 = new Cliente (nmroConta,nmroAgencia,nome,saldo);
         JOptionPane.showMessageDialog(null, cliente00.toString());
        
    }
    
}
