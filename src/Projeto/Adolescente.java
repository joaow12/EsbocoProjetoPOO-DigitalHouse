package Projeto;

public class Adolescente extends Pessoa {
	
	public Adolescente(String nome, String sexo, int idade, float peso, float altura, float imc, String cimc) {
		
		super(nome, sexo, idade, peso, altura, imc, cimc);
		
	}
	
	public Adolescente() {
		
		super("", "", 0, 0f, 0f, 0f, "");
		
	}
	
	@Override
	public String imprmirRelatorio() {
		String msg;
		msg = "Ficha do Adolescente: " + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade() + "\nPeso: " + getPeso() +
				"\nAltura: " + getAltura() + "\nIMC: " + getImc() + "\nClassificação do IMC: " + getCimc();
		
		return msg;
	}

}
