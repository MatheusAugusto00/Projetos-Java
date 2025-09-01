package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa Tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String frase = "Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + "\nIdade: " + idade +
				"\nSalário: " + salario + "\n\n";
		System.out.println(frase);		
		
		System.out.printf("O senhor %s %s tem %d anos e ganha RS%.2f.",
				nome,sobrenome,idade,salario);
		
		String outraFrase = String.format("\nO senhor %s %s tem %d anos e ganha RS%.2f.",
				nome,sobrenome,idade,salario);
		System.out.println(outraFrase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,10));
	}
}
