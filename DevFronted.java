package br.com.vainaweb.backendt3.classeabstrata;

public class DevFronted extends Colaborador{

	
	
	public DevFronted() {
		super();
		// TODO Auto-generated constructor stub
	}


	 public DevFronted(String nome, String cpf, double salario, boolean isAtivo, String genero, String modeloContratacao, String senioridade) {
	        super(nome, cpf, salario, isAtivo, genero, modeloContratacao, senioridade);
	 }
	 
	@Override
	public void aumentarSalario() {
		// TODO Auto-generated method stub
		this.setSalario(getSalario()*1.2);
	}

}
