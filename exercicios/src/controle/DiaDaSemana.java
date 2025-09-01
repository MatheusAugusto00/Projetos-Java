package controle;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.toLowerCase().equals("domingo")) {
			System.out.println(1);
		}else
			if(dia.toLowerCase().equals("segunda")) {
				System.out.println(2);
		}else
			if(dia.toLowerCase().equals("terça")
				||(dia.equalsIgnoreCase("terca"))) {
				System.out.println(3);
		}else
			if(dia.toLowerCase().equals("quarta")) {
				System.out.println(4);
		}else
			if(dia.toLowerCase().equals("quinta")) {
				System.out.println(5);
		}else
			if(dia.toLowerCase().equals("sexta")) {
				System.out.println(6);
		}else
			if(dia.toLowerCase().equals("sabado")
				||(dia.equalsIgnoreCase("sábado"))) {
				System.out.println(7);
		}else
			System.out.println("Verifique se escreveu o dia corretamente");
		entrada.close();
	}
}
