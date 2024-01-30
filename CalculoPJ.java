package br.com.vainaweb.backendt3.classeabstrata;

public class CalculoPJ implements BeneficiosColaborador {

	
	 private Colaborador colaborador;
	 
	   @Override
	    public void inicializarCalculo(Colaborador colaborador) {
		// TODO Auto-generated method stub
		 this.colaborador = colaborador;
	   }
	
	   @Override
	    public void calcularFGTS() {

	    }

	    @Override
	    public void calcularValeTransporte() {

	    }

	    @Override
	    public void calcularAlimentacao() {
	       // System.out.println("Calculando Alimentação para PJ");
	        colaborador.setAlimentacao(colaborador.getSalario()* 0.1);
	    }

	    @Override
	    public void calcularRefeicao() {
	        //System.out.println("Calculando Refeição para PJ");
	        colaborador.setRefeicao(colaborador.getSalario()*0.6);
	    }

}
