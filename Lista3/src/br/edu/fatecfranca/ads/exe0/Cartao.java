package br.edu.fatecfranca.ads.exe0;

public class Cartao {
    private int cvv;
    private String validade, bandeira, nro;
    private Conta conta; // 
    private String senhaCartao;
    
    public Cartao (){
    
    }

    public String getSenhaCartao() {
        return senhaCartao;
    }

    public void setSenhaCartao(String senhaCartao) {
        this.senhaCartao = senhaCartao;
    }
 
    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public boolean sacar (float x, String senha){
        if (this.conta.getSaldo() >= x && this.senhaCartao.equals(senha) ){
            this.conta.setSaldo(this.conta.getSaldo()-  x);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cartao{" + "nro=" + nro + ", cvv=" + cvv + ", validade=" + 
                validade + ", bandeira=" + bandeira + ", conta=" + conta.toString() + '}';
    }
    
    
    
    
}
