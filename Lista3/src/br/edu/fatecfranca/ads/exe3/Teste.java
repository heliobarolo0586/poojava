
package br.edu.fatecfranca.ads.exe3;

import javax.swing.JOptionPane;


public class Teste {

   
    public static void main(String[] args) {
        Passageiro cliente01 = new Passageiro ("Du","55.936.251-8");
        Passageiro cliente02 = new Passageiro ("Dudu","55.938.251-8");
        Passageiro cliente03 = new Passageiro ("Edu","55.937.251-8");
        
        Onibus onibus01 = new Onibus ();
        onibus01.setNumero(15);
        onibus01.setPlaca("FJF-1535");
        onibus01.addPassageiro(cliente01); 
        onibus01.addPassageiro(cliente02); 
        onibus01.addPassageiro(cliente03); 
        
        Onibus onibus02 = new Onibus ();
        onibus02.setNumero(02);
        onibus02.setPlaca("GHA-1478");
        onibus02.addPassageiro(cliente03);
        onibus02.addPassageiro(cliente01);
        
        
        JOptionPane.showMessageDialog(null,onibus01.toString());
        
        onibus01.removePassageiro(cliente02);
        
        JOptionPane.showMessageDialog(null,onibus01.toString());
        JOptionPane.showMessageDialog(null,onibus01.getPassageiro(cliente03));
        
       
        Rodoviaria rodo = new Rodoviaria();
        rodo.setCidade("Franca");
        rodo.setNome("Eldini da Rocha");
        rodo.addRodoviaria(onibus01);
        rodo.addRodoviaria(onibus02);
        
        JOptionPane.showMessageDialog(null, rodo.toString());
        
        Onibus onibus03 = new Onibus();
        onibus03.setNumero(onibus02.getNumero());
        onibus03.setPlaca("UHJ-9654");
        
        rodo.uptadeRodoviaria(onibus01, onibus03);
        
  
        JOptionPane.showMessageDialog(null, rodo.toString());
        
        
        
        
        
        
        
        
        
        
    }
    
}
