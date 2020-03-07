package br.edu.fatecfranca.ads.exe1;

import java.util.Date;


public class Reserva {
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;
  
    public Reserva (){
    
    }

    public Reserva(int codigo, Date data) {
        this.setCodigo(codigo);
        this.setData(data);
    }
    
    //getters
    public int getCodigo() {
        return this.codigo;
    }

    public Date getData() {
        return this.data;
    }
    
    //setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    

    @Override
    public String toString() {
        return "Reserva{" + "\n codigo=" + codigo + "\n data=" + data + '}';
    }
    
    
    
    
    
}
