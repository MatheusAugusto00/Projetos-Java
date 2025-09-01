package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String valor = entrada.next();
		
		while((valor.equalsIgnoreCase("saida")
			||valor.equalsIgnoreCase("saída"))==false) {
			System.out.print("Digite um texto: ");
			valor = entrada.next();
		}
		System.out.println("Fim!");
		entrada.close();
	}
}
