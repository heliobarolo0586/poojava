package br.edu.fatecfranca.ads.exe1;

import java.util.Date;
import javax.swing.JOptionPane;

public class TestaPassageiro {

    public static void main(String[] args) {
        Passageiro objParte0 = new Passageiro();
        objParte0.setCpf("448.755.468-31");
        objParte0.setNome("Hélio");

        Voo objParte01 = new Voo();
        objParte01.setDestino("Marrocos");
        objParte01.setNumero("15337");

        Reserva objTodo = new Reserva();
        objTodo.setCodigo(12);
        objTodo.setData(new Date());
        objTodo.setVoo(objParte01);
        objTodo.setPassageiro(objParte0);

        JOptionPane.showMessageDialog(null, objTodo.toString());

    }

}
