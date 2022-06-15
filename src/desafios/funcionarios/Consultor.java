package desafios.funcionarios;

public class Consultor extends Funcionarios{
	private double valorHora;
	private double horasTrabalhadas;
	
	
	public Consultor(String nome, long cpf, double valorHora, double horasTrabalhadas) {
		super(nome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	

	@Override
	public double calcularSalario() {
		return valorHora * horasTrabalhadas;
	}



	public double getValorHora() {
		return valorHora;
	}



	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}



	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}



	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	

}
