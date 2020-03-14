package br.edu.fatecfranca.ads.exe1;

import java.util.Calendar;
import java.util.Date;


public class Reserva {
    private int codigo;
    private Date data;
    //assosiações
    private Passageiro passageiro;
    private Voo voo;
  
    public Reserva (){
    
    }

    public Reserva(int codigo, Date data, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    Reserva(int i, Calendar c, Passageiro objParte0, Voo objParte01) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
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
        return "RESERVA: " + "\n codigo=" + codigo + "\n data=" + data + "\n PASSAGEIRO:" + passageiro + "\n VOO: " + voo;
    }
    
    

}
