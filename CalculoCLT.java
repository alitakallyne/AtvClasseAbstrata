package br.com.vainaweb.backendt3.classeabstrata;

public class CalculoCLT implements BeneficiosColaborador {

	    private Colaborador colaborador;

	    @Override
	    public void inicializarCalculo(Colaborador colaborador) {
	        this.colaborador = colaborador;
	    }

	    @Override
	    public void calcularFGTS() {
	        //System.out.println("Calculando FGTS para CLT");
	       colaborador.setFgts( colaborador.getSalario()* 0.08);
	    }

	    @Override
	    public void calcularValeTransporte() {
	       // System.out.println("Calculando Vale Transporte para CLT");
	        colaborador.setValeTransporte(colaborador.getSalario()* 0.06);
	    }

	    @Override
	    public void calcularAlimentacao() {
	       // System.out.println("Calculando Alimentação para CLT");
	        colaborador.setAlimentacao(colaborador.getSalario()* 0.2);
	    }

	    @Override
	    public void calcularRefeicao() {
	       // System.out.println("Calculando Refeição para CLT");
	        colaborador.setRefeicao(colaborador.getSalario()*0.1);
	    }
	
}
