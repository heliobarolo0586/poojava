
package br.edu.fatecfranca.ads;


public class Produto {
    private int id;
    private int qtde;
    private String Descricao;
    private float preco;
    //Método construtor
    public Produto (){
        this.Descricao = "Ainda não definido";
        this.id = 0;
        this.qtde = 0;
        this.preco = 0; 
        
    }
    
    public Produto (int id,int qtde,String Descricao,float preco){
        this.Descricao = Descricao;
        this.id = id;
        this.qtde = qtde;
        this.setPreco (preco);
    }
    
 
    //setters , sstte atribui.
    public void setPreco (float preco){
        if (preco >= 0){
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser vazio");
        }
    }
     public  void setQtde (int qtde){
         this.qtde = qtde;
     }
     
     public void setId (int id){
         this.id =  id;
     }
     
     public void setDescricao (String Descricao){
         this.Descricao = Descricao;
     }
    
    //getter, sempre tem return anotar no caderno seu burro.
    public float getPreco(){
        return this.preco;
    }
    public int getQtde (){
        return this.qtde;
    }
    public int getId (){
        return this.id;
    }
    public String getDescricao (){
        return this.Descricao;
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
        this.setPreco (this.preco -x);
    }
    
    public String toString (){
        return "Descrição: " + this.Descricao +
                "\n Quantidade: " + this.qtde +
                        "\n Preço: " + this.preco +
                                "\n ID: " + this.id;
    }
    
    
}
