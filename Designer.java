package br.com.vainaweb.backendt3.classeabstrata;


public class Designer  extends  Colaborador{

    public Designer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Designer(String nome, String cpf, double salario, boolean isAtivo, String genero, String modeloContratacao, String senioridade) {
        super(nome, cpf, salario, isAtivo, genero, modeloContratacao, senioridade);
    }

    @Override
    public void aumentarSalario() {
        setSalario(getSalario() * 1.20);
    }
}
