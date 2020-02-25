
package br.edu.fatecfranca.ads;


public class Produto {
    int id;
    int qtde;
    String Descricao;
    float preco;
    //Método construtor
    public Produto (){
        
    }
    
    public Produto (int id,int qtde,String Descricao,float preco){
        this.Descricao = Descricao;
        this.id = id;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    //Métodos
    public void comprar (int x){
        this.qtde = this.qtde + x;
    }
    public void vender (int x ){
        this.qtde = this.qtde - x;
    }
    public void subir (float x){
        this.preco = this.preco + x;
    }
    public void descer (float x ){
        this.preco = this.preco -x;
    }
    
    public String toString (){
        return "Descrição: " + this.Descricao +
                "\n Quantidade: " + this.qtde +
                        "\n Preço: " + this.preco +
                                "\n ID: " + this.id;
    }
    
    
}
