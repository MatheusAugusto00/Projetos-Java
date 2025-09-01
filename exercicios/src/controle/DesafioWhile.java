package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota = 0.0;
		int numeroNotas = 0;
		double total = 0.0;
		
		while(nota != -1) {
			System.out.println("Digite -1 para sair do programa.");
			System.out.print("Digite o valor da nota: ");

			nota = entrada.nextDouble();
			if(nota > 10 || nota < 0) {
				System.out.println("Nota inválida");
			}else {
				numeroNotas++;
				total = total + nota;
			}		
			
		}
		double media = total/numeroNotas;
		System.out.println("Quantidade de notas inseridas: "+numeroNotas);
		System.out.println("Soma das notas: "+total);
		System.out.println("A media do aluno é: "+media);
		entrada.close();
	}
}
