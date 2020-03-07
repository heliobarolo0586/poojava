
package br.edu.fatecfranca.ads.exe1;


public class Passageiro {
    private String nome;
    private String cpf;
    private Reserva reserva;
    
    public Passageiro (){
    
    }

    public Passageiro(String nome, String cpf, Reserva reserva) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setReserva(reserva);
    }
    
    
    
    //Getters

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Reserva getReserva() {
        return this.reserva;
    }
    
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "\n nome=" + nome + "\n cpf=" + cpf + "\n reserva=" + reserva + '}';
    }
    
    
    
    
}
