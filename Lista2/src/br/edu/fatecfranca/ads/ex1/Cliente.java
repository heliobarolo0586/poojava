
package br.edu.fatecfranca.ads.ex1;


public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    //construtores
    public Cliente (){
        this.numeroConta = "ainda nao definido";
        this.numeroAgencia = "ainda nao definido";
        this.nome = "ainda nao definido";
        this.saldo = 0;
     
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome (nome);
        this.setSaldo (saldo);
    }
    
    
    // setters
    public void setNumeroConta (String numeroConta) {
        if ((numeroConta.length()== 8) && (numeroConta.charAt(6) == '-')){
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Numero de conta inválido!");
        }
    }
    public void setNumeroAgencia (String numeroAgencia){ 
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'){ 
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Numero da conta inválido");
        }
    }
    public void setNome (String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        } else {
            System.out.println("Nome com mais de 30 caracteres");
        }
    }
    public void setSaldo (float saldo){ 
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo negativo");
        }
    }
    //getters
    public String getNumeroConta (){
        return this.numeroConta;
    }
    public String getNumeroAgencia (){
        return this.numeroAgencia;
    }
    public String getNome (){
        return this.nome;
    }
    public float getSaldo (){
        return this.saldo;
    }
    // Métodos
    public void realizarDeposito (float x){
        this.saldo = this.saldo + x;
    }
    public void realizarSaque (float x){
        this.setSaldo(this.saldo - x);
    }
    public String toString () {
        return "Numero da Conta: " + this.numeroConta +
                "\n Numero da Agência: " + this.numeroAgencia +
                "\n Nome do Cliente: " + this.nome +
                "\n Saldo Atual: " + this.saldo ;
    }
    
    

}
