package br.com.vainaweb.backendt3.classeabstrata;


import java.time.LocalDate;
import java.util.Scanner;

public  abstract class Colaborador {

    private String nome;
    private String cpf;
    private double salario;
    protected boolean isAtivo = true;
    private static int proximoNumeroMatricula = 1;
    private int numeroMatricula;
    private String genero;
    private LocalDate dataContratacao;

    private String modeloContratacao;
    private double fgts;
    private double decimoTerceiro;
    private String senioridade;
    private double valeTransporte;
    private double alimentacao;
    private double refeicao;

    private BeneficiosColaborador calculoBeneficios;

    // Construtores
    public Colaborador() {    }



    public Colaborador(String nome, String cpf, double salario, boolean isAtivo, String genero,
                       String modeloContratacao,String senioridade) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.isAtivo = isAtivo;
        this.genero = genero;
        this.modeloContratacao = modeloContratacao;
        this.senioridade = senioridade;
        this.numeroMatricula = proximoNumeroMatricula++;;
        this.dataContratacao = LocalDate.now();
        inicializarCalculoBeneficios();
    }

    public void setCalculoBeneficios(BeneficiosColaborador calculoBeneficios) {
        this.calculoBeneficios = calculoBeneficios;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }

    public double getDecimoTerceiro() {
        return decimoTerceiro;
    }

    public void setDecimoTerceiro(double decimoTerceiro) {
        this.decimoTerceiro = decimoTerceiro;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(double alimentacao) {
        this.alimentacao = alimentacao;
    }

    public double getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(double refeicao) {
        this.refeicao = refeicao;
    }

    public String getModeloContratacao() {
        return modeloContratacao;
    }

    public void setModeloContratacao(String modeloContratacao) {
        this.modeloContratacao = modeloContratacao;
    }
// Métodos

    public void inicializarCalculoBeneficios() {
        if ("CLT".equalsIgnoreCase(modeloContratacao)) {
            calculoBeneficios = new CalculoCLT();
        } else if ("PJ".equalsIgnoreCase(modeloContratacao)) {
            calculoBeneficios = new CalculoPJ();
        } else {
            throw new IllegalArgumentException("Modelo de contratação inválido: " + modeloContratacao);
        }
        calculoBeneficios.inicializarCalculo(this);
    }

    public void calcularBeneficios() {
        calculoBeneficios.calcularAlimentacao();
        calculoBeneficios.calcularValeTransporte();
        calculoBeneficios.calcularFGTS();
        calculoBeneficios.calcularRefeicao();
    }

    public String visualizar() {
        return "[Colaborador " + this.nome + ", do CPF: " + this.cpf + " ]" + "\nSalario: " + this.salario
                + "\nStatus: " + (this.isAtivo? "Vinculado" : "Sem vinculo");
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", isAtivo=" + isAtivo +
                ", numeroMatricula=" + numeroMatricula +
                ", genero='" + genero + '\'' +
                ", dataContratacao=" + dataContratacao +
                ", modeloContratacao='" + modeloContratacao + '\'' +
                ", fgts=" + fgts +
                ", decimoTerceiro=" + decimoTerceiro +
                ", senioridade='" + senioridade + '\'' +
                ", valeTransporte=" + valeTransporte +
                ", alimentacao=" + alimentacao +
                ", refeicao=" + refeicao +
                '}';
    }

    public abstract void aumentarSalario();

    public void demitir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tem certeza que deseja desvincular " + this.nome);
        Character resposta = sc.next().toLowerCase().charAt(0);
        if(resposta.equals('s')) {
            System.out.println("Você está demitido, promovido a usuário");
            this.isAtivo = false;
            salario = 0.0;
        }

        sc.close();
    }
}
