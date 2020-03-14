    package br.edu.fatecfranca.ads.exe2;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        Disciplina di1 = new Disciplina(1, "POO");
        Disciplina di2 = new Disciplina(2, "Cálculo");
        Disciplina di3 = new Disciplina(3, "ED");
        Disciplina di4 = new Disciplina(4, "IHC");

        Curso cr = new Curso();
        cr.setId(10);
        cr.setNome("ADS");
        cr.addDisciplinas(di1);
        cr.addDisciplinas(di2);
        cr.addDisciplinas(di3);
        cr.addDisciplinas(di4);

        JOptionPane.showMessageDialog(null, cr.toString());

        cr.removeDisciplina(di2);

        JOptionPane.showMessageDialog(null, cr.toString());

        Disciplina di5 = new Disciplina();
        di5.setId(di3.getId());
        di5.setNome("Estrutura de Dados");

        cr.uptadeDisciplina(di3, di5);
        JOptionPane.showMessageDialog(null, cr.toString());

    }

}
