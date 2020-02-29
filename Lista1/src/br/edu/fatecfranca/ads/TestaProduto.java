
package br.edu.fatecfranca.ads;
import javax.swing.JOptionPane;


public class TestaProduto {
    
    public static void main(String[] args) {
        // Variaveis para entrada de dados usando input
        int id = Integer.parseInt (JOptionPane.showInputDialog("Informe id do produto."));
        int quan = Integer.parseInt (JOptionPane.showInputDialog("Informe a quantidade."));
        String descricao = JOptionPane.showInputDialog("Descrição do Produto.");
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço."));
        // Criado objetos
        Produto produto01 = new Produto ();
        Produto produto02 = new Produto(id,quan,descricao,preco);
        
        produto01.setId(32);
        produto01.setDescricao ("Sorvete de Pessego");
        produto01.setPreco (5);
        produto01.setQtde (50);
        
        // usando metodos nos objetos.
        produto01.comprar (20);
        produto01.descer(2);
        produto01.subir(3);
        produto01.vender (37);
        
        produto02.comprar(215);
        produto02.descer(13);
        produto02.subir(11);
        produto02.vender(400);
        // mostrando msg na tela.
        JOptionPane.showMessageDialog(null, produto01.toString());
        JOptionPane.showMessageDialog(null,produto02.toString());
        
        
        
        
        
    }
    
}
