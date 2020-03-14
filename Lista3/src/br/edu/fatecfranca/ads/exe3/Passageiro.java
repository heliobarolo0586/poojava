
package br.edu.fatecfranca.ads.exe3;


public class Passageiro {
    private String nome;
    private String rg;

    public Passageiro() {
    }

    public Passageiro(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "\n Passageiro: " + "nome=" + nome + ", rg=" + rg;
    }
    
}
