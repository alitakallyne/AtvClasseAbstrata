package br.com.vainaweb.backendt3.classeabstrata;

public class DevBackend  extends Colaborador {
	
	
	
	
	public DevBackend() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public DevBackend(String nome, String cpf, double salario, boolean isAtivo, String genero, String modeloContratacao, String senioridade) {
	        super(nome, cpf, salario, isAtivo, genero, modeloContratacao, senioridade);
	  }
	

	@Override
	public void aumentarSalario() {
		this.setSalario(getSalario()*1.8);	
	}
	
	

}
