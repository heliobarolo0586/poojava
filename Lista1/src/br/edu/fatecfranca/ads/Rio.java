
package br.edu.fatecfranca.ads;

public class Rio {
    
    String nome;
    float nivel;
    boolean poluido;
    
    //Métodos construtores
    public Rio (){}
    public Rio (String nome, float nivel,boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
        
    }
    
    //Métodos
    public void chover (float x){
        this.nivel = this.nivel + x;
    }
    public void ensolarar (float x ){
        this.nivel = this.nivel -x;
    }
    public void limpar (){
        this.poluido = false;
    }
    public void sujar (){
        this.poluido = true;
    }
    
    public String mostrar (){
        return "Nome do Rio: " + this.nome +
                "\n Nível do Rio: " + this.nivel +
                "\n Poluido: " + this.poluido ;
    }
    
    
}
