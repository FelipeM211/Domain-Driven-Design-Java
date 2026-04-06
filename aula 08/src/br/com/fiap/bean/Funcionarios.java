package br.com.fiap.bean;

public class Funcionarios {
    // atributos
    private String nome;
    private float valorHoraTrabalho;

    //construtores (Alt + Insert)
    public Funcionarios(){

    }

    public Funcionarios(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        this.valorHoraTrabalho = valorHoraTrabalho;
    }

    // métodos getters/setters (Alt+Insert)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        try {
            if (valorHoraTrabalho > 0){
                this.valorHoraTrabalho = valorHoraTrabalho;

            }else {
                throw new Exception("Valor não pode ser menor ou igual a zero");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //métodos da classe
    public  float calcularSalario(float qtdeHorasTrabalhadaSemana){
        return valorHoraTrabalho * qtdeHorasTrabalhadaSemana * 4;
    }
}
