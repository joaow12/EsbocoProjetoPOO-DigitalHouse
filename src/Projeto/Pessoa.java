package Projeto;

public abstract class Pessoa implements IPessoa {

	private String nome;
	private String sexo;
	private int idade;
	private float peso;
	private float altura;
	private float imc;
	private String cimc;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sexo, int idade, float peso, float altura, float imc, String cimc) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.cimc = cimc;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public String getCimc() {
		return cimc;
	}

	public void setCimc(String cimc) {
		this.cimc = cimc;
	}

	public float calcularIMC() {
        setImc(getPeso()/(getAltura()*getAltura()));
        
        return getImc();
	}
	
	public String classificarIMC(float imc) {
		if(imc<=18.5) {
			setCimc("Abaixo do peso");
		}else if(imc<=24.9) {
			setCimc("Peso normal");
		}else if(imc<=29.9) {
			setCimc("Sobrepeso");
		}else if(imc<=34.9) {
			setCimc("Obesidade grau I");
		}else if(imc<=39.9) {
			setCimc("Obesidade grau II");
		}else {
			setCimc("Obesidade mórbida");
		}
		
		return getCimc();
	}
	
	public abstract String imprmirRelatorio();
	
	
	
	
	
}
