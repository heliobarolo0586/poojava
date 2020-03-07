package br.edu.fatecfranca.ads.exe1;


public class Voo {
    private String numero;
    private String destino ;
    private Reserva reserva;
    
    public Voo (){
    
    }

    public Voo(String numero, String destino, Reserva reserva) {
        this.setNumero(numero);
        this.setDestino(destino);
        this.setReserva(reserva);
    }
    
    
    //getters

    public String getNumero() {
        return this.numero;
    }

    public String getDestino() {
        return this.destino;
    }

    public Reserva getReserva() {
        return this.reserva;
    }
    
    //setters

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Voo{" + "\n numero=" + numero + "\n destino=" + destino + "\n reserva=" + reserva + '}';
    }
    
    
    
    
}
