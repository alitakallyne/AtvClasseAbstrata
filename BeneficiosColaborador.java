package br.com.vainaweb.backendt3.classeabstrata;

public interface BeneficiosColaborador {

	    public void calcularFGTS() ;

	    public void calcularValeTransporte() ;
	    

	    public void calcularAlimentacao() ;

	    public void calcularRefeicao() ;

		void inicializarCalculo(Colaborador colaborador);
}
