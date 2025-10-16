package model;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private String matricula;

    public Funcionario(String nome, double salario, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Salário: " + salario + " | Matrícula: " + matricula;
    }
}
