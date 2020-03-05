package br.edu.fatecfranca.ads.ex1;

public class Aluno {

    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;
    
    public Aluno (){
        this.numeroAluno = 0;
        this.idade = 0;
        this.nome = "Ainda não definido";
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
       this.setNumeroAluno (numeroAluno);
       this.setIdade (idade);
       this.setNome(nome);
       this.setP1(p1);
       this.setP2(p2);
    }

    

    //Métodos modificadores setters
    public void setNumeroAluno(int numeroAluno) {
        if (Integer.toString(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Numero de aluno inválido!");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("Digite um valor positivo!");
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("Digite um valor positivo!");
        }
    }
    //Métodos acessores getters
    public int getNumeroAluno (){
        return this.numeroAluno;
    }
    public int getIdade (){
        return this.idade;
    }
    public String getNome (){
        return this.nome;
    }
    public float getP1 (){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    
    //Métodos
    public float notaFinal (){
        if (this.p1 + this.p2 == 0){
            return 0;
        } else {
            return (this.p1 + this.p2) / 2;
        }
        
    }
    
    public String dadosAluno(){
        return "Numero do Aluno: " + this.numeroAluno +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade;
    }
    
    public String passou(){
        if (notaFinal()>= 6){
            return "Passou!";
        } else {
            return "Se esforce mais!";
        }
        
    }
    

}
