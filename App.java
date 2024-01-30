package br.com.vainaweb.backendt3.classeabstrata;

public class App {

    public static void main(String[] args) {
    	DevBackend devBackEndJunior = new DevBackend("Felpudo", "1234-0", 10000.0, true, "Masculino", "CLT","Jr");
    	DevFronted devFrontEndJunior = new DevFronted("Luccas", "9875-9", 10000.0, true, "Masculino", "PJ","Jr");
        Designer designerJunior = new Designer("Klayvem", "4563-6", 12000.0, true, "Masculino", "CLT","Jr");
        TechLeader techLead = new TechLeader("João Pedro Belo", "222.356.790.23", 25000.0, true, "Masculino", "PJ","Jr");

        System.out.println("-----------Antes------------------");
        System.out.println(devBackEndJunior.visualizar());
        System.out.println("----------------------------------");
        System.out.println(devFrontEndJunior.visualizar());
        System.out.println("----------------------------------");
        System.out.println(designerJunior.visualizar());
        System.out.println("----------------------------------");
        System.out.println(techLead.visualizar());
        System.out.println();
        System.out.println("-----------Depois------------------");
        
        devBackEndJunior.aumentarSalario();
        devFrontEndJunior.aumentarSalario();
        designerJunior.aumentarSalario();
        techLead.aumentarSalario();
        devFrontEndJunior.aumentarSalario();

        // Realizando os cálculos dos benefícios
        devBackEndJunior.calcularBeneficios();
        devFrontEndJunior.calcularBeneficios();
        designerJunior.calcularBeneficios();
        techLead.calcularBeneficios();


        System.out.println(devBackEndJunior.toString());
        System.out.println("----------------------------------");
        System.out.println(devFrontEndJunior.toString());
        System.out.println("----------------------------------");
        System.out.println(designerJunior.toString());
        System.out.println("----------------------------------");
        System.out.println(techLead.toString());
    }
}
