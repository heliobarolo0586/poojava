package br.edu.fatecfranca.ads.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno01 = new Aluno ();
        
        aluno01.setNome("Eduardo");
        aluno01.setNumeroAluno(153154);
        aluno01.setIdade(15);
        aluno01.setP1(50);
        aluno01.setP2(50);
        
        aluno01.toString();
        
        //aluno01.nome = "Carlinhos"; sem o set nao epossivel acessar variavel pois
        // ela esta em modo private
        //JOptionPane.showMessageDialog(null, aluno01.nome);
        // erro novamente por causa do private e necessario usar o get.
        JOptionPane.showMessageDialog(null, aluno01.getNome());
        //Testes 
        JOptionPane.showMessageDialog(null,aluno01.passou());
        JOptionPane.showMessageDialog(null,aluno01.notaFinal());
        JOptionPane.showMessageDialog(null, aluno01.dadosAluno());
        
        String nomeAluno = JOptionPane.showInputDialog("Digíte o nome do aluno!");
        int nmrAluno = Integer.parseInt(JOptionPane.showInputDialog("Digíte o numero do Aluno!"));
        int idaAluno = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno!"));
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota numero um!"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota numero dois!"));
        
        Aluno aluno02 = new Aluno (nmrAluno,idaAluno,nomeAluno,nota1,nota2);
        JOptionPane.showMessageDialog(null,aluno02.passou());
        JOptionPane.showMessageDialog(null,aluno02.notaFinal());
        JOptionPane.showMessageDialog(null,aluno02.dadosAluno());
        
    }
    
}
