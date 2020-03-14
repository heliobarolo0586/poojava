package br.edu.fatecfranca.ads.exe1;

import java.util.Calendar;
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
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, Calendar.APRIL);
        c.set(Calendar.DAY_OF_MONTH, 29);
        
        Reserva objTodo = new Reserva(12,c.getTime(),objParte0,objParte01);
      

        JOptionPane.showMessageDialog(null, objTodo.toString());

    }

}
