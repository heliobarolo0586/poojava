package br.edu.fatecfranca.ads.exe3;

import java.util.ArrayList;


public class Rodoviaria {
    private String nome;
    private String cidade;
    private ArrayList<Onibus> onibus;

    public Rodoviaria() {
        onibus = new ArrayList();
    }

    public Rodoviaria(String nome, String cidade, ArrayList<Onibus> onibus) {
        this.nome = nome;
        this.cidade = cidade;
        this.onibus = onibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        return "Rodoviaria: " + "nome=" + nome + ", cidade=" + cidade + ", onibus: " + onibus ;
    }
    
    public void addRodoviaria (Onibus onibus){
        this.onibus.add(onibus);
    }
    
    public boolean removeRodoviaria(Onibus onibus){
        return this.onibus.remove(onibus);
    }
    
    public int getRodoviaria (Onibus onibus){
        return this.onibus.indexOf(onibus);
    }
    
    public boolean uptadeRodoviaria (Onibus atual, Onibus novo){
        int posicao = this.getRodoviaria(atual);
        if (posicao != 1){
            this.onibus.set(posicao,novo);
            return true;
        } 
        else return false;
        
    }
    
    
    
    
    
}
