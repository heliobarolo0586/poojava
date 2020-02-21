
package br.edu.fatecfranca.ads;
import javax.swing.JOptionPane;


public class TestaProduto {

    
    public static void main(String[] args) {
        Produto produto01 = new Produto ();
        Produto produto02 = new Produto(25,100,"Pirarucu",45);
        
        produto01.id = 32;
        produto01.Descricao = "Sorvete de Pessego";
        produto01.preco = 5;
        produto01.qtde = 50;
        
        
        produto01.comprar (20);
        produto01.descer(2);
        produto01.subir(3);
        produto01.vender (37);
        
        produto02.comprar(215);
        produto02.descer(13);
        produto02.subir(11);
        produto02.vender(400);
     
        JOptionPane.showMessageDialog(null, produto01.toString());
        JOptionPane.showMessageDialog(null,produto02.toString());
        
        
        
        
        
    }
    
}
