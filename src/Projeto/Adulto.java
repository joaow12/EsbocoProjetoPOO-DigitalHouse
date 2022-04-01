package Projeto;

public class Adulto extends Pessoa {
	
	public Adulto(String nome, String sexo, int idade, float peso, float altura, float imc, String cimc) {
		
		super(nome, sexo, idade, peso, altura, imc, cimc);
		
	}
	
	public Adulto() {
		
		super("", "", 0, 0f, 0f, 0f, "");
		
	}
	
	@Override
	public String imprmirRelatorio() {
		String msg;
		msg = "Ficha do Adulto: " + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade() + "\nPeso: " + getPeso() +
				"\nAltura: " + getAltura() + "\nIMC: " + getImc() + "\nClassificação do IMC: " + getCimc();
		
		return msg;
	}
	
	

}
