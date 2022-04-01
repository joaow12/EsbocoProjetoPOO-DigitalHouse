package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args) {
		ArrayList <Pessoa> p = new ArrayList();
		int op, contAbaixo, contAcima, contNormal;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("-----------------------------");
			System.out.println("Digite a opção desejada: \n1 - Cadastrar um adulto \n2 - Cadastrar um adolescente \n3 - Cadastrar uma criança "
					+ "\n4 - Mostrar todos as pessoas cadastradas \n5 - Mostrar estatisticas das pessoas cadastradas \n6 - Sair do programa");
			op = leia.nextInt();
			
			switch(op) {
				case 1:
					leia.nextLine();
					Adulto a = new Adulto();
					System.out.println("Digite o nome: ");
					a.setNome(leia.nextLine());
					System.out.println("Digite o sexo: ");
					a.setSexo(leia.nextLine());
					System.out.println("Digite a idade: ");
					a.setIdade(leia.nextInt());
					while(a.getIdade()<18) {
						System.out.println("A idade esta abaixo (de 18 para cima) do considerado para adulto, por favor digite novamente");
						a.setIdade(leia.nextInt());
					}
					System.out.println("Digite a altura: ");
					a.setAltura(leia.nextFloat());
					System.out.println("Digite o peso: ");
					a.setPeso(leia.nextFloat());
					a.calcularIMC();
					a.classificarIMC(a.getImc());
					System.out.println(a.imprmirRelatorio());
					p.add(a);
					break;
				
				case 2:
					leia.nextLine();
					Adolescente b = new Adolescente();
					System.out.println("Digite o nome: ");
					b.setNome(leia.nextLine());
					System.out.println("Digite o sexo: ");
					b.setSexo(leia.nextLine());
					System.out.println("Digite a idade: ");
					b.setIdade(leia.nextInt());
					while(b.getIdade()<12 || b.getIdade()>18) {
						System.out.println("A idade esta acima ou abaixo do considerado para adolescente (de 12 a 18 anos), por favor digite novamente");
						b.setIdade(leia.nextInt());
					}
					System.out.println("Digite a altura: ");
					b.setAltura(leia.nextFloat());
					System.out.println("Digite o peso: ");
					b.setPeso(leia.nextFloat());
					b.calcularIMC();
					b.classificarIMC(b.getImc());
					System.out.println(b.imprmirRelatorio());
					p.add(b);
					break;
				
				case 3:
					leia.nextLine();
					Crianca c = new Crianca();
					System.out.println("Digite o nome: ");
					c.setNome(leia.nextLine());
					System.out.println("Digite o sexo: ");
					c.setSexo(leia.nextLine());
					System.out.println("Digite a idade: ");
					c.setIdade(leia.nextInt());
					while(c.getIdade()>12 || c.getIdade()<1) {
						System.out.println("A idade está acima ou abaixo do que é considerado criança (de 1 a 12 anos), por favor digite novamente");
						c.setIdade(leia.nextInt());
					}
					System.out.println("Digite a altura: ");
					c.setAltura(leia.nextFloat());
					System.out.println("Digite o peso: ");
					c.setPeso(leia.nextFloat());
					c.calcularIMC();
					c.classificarIMC(c.getImc());
					System.out.println(c.imprmirRelatorio());
					p.add(c);
					break;
				
				case 4:
					for(int i = 0; i<p.size(); i++) {
						System.out.println(p.get(i).imprmirRelatorio());
						System.out.println("-----------------------------");
					}
					break;
				
				case 5:
					contAbaixo = 0;
					contAcima = 0;
					contNormal = 0;
					
					for(int i = 0; i<p.size(); i++) {
						switch(p.get(i).getCimc()) {
						
							case "Abaixo do peso":
								contAbaixo++;
								break;
							
							case "Peso normal":
								contNormal++;
								break;
							
							default:
								contAcima++;
								break;
						
						}
					}
					System.out.println("Das " + p.size() + " que se cadastraram no sistema " + contAbaixo + " estão com o IMC classificado abaixo do normal"
							+ " , " + contAcima + " estão com o IMC classificado acima do normal e " + contNormal + " estão com o IMC classificado normal");
				
				case 6:
					System.out.println("Programa encerrado");
					break;
				
				default:
					System.out.println("Opção inválida");
					break;
			}
			
		}while(op != 6);

	}

}
