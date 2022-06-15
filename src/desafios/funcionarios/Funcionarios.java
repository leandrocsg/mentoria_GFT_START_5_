package desafios.funcionarios;
/*Considerando o diagrama abaixo, feito para uma empresa de vendas. Nesse contexto, utilize
 *  o conceito de Heran�a para remodel�-lo e implemente um programa que explore o dom�nio 
 *  em quest�o:

Regras:
a) Crie uma classe m�e chamada Funcionario com os atributos nome, cpf 
(passados pelo construtor), uma constante para armazenar o valor do sal�rio 
m�nimo e um m�todo abstrato �calcularSalario�;
b) Vendedores ganham 1 sal�rio m�nimo, mais uma comiss�o por vendas;
c) Consultores ganham somente pelas horas que trabalharam.*/

public abstract class Funcionarios {
	private String nome;
	private long cpf;
	protected final Double SALARIO_MINIMO = 1000.0;
	
	public Funcionarios(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public abstract double calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Double getSALARIO_MINIMO() {
		return SALARIO_MINIMO;
	}
	
	
	
	
}
