package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String primeiroSalario = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salário: ");
		String segundoSalario = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salário: ");
		String terceiroSalario = entrada.nextLine().replace(",", ".");
		
		double num1 = Double.parseDouble(primeiroSalario);
		double num2 = Double.parseDouble(segundoSalario);
		double num3 = Double.parseDouble(terceiroSalario);
		
		System.out.println("O 3 salarios conjuntos: "+ (num1+num2+num3));
		System.out.println("A média dos salários é: "+(num1+num2+num3)/3);
		entrada.close();
	}
} 
