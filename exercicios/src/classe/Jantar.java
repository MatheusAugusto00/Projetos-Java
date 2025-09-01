package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida();
		c1.nome = "Feijão";
		c1.peso = 0.202;
		
		Comida c2 = new Comida();
		c2.nome = "Macarrão";
		c2.peso = 0.302;
		
		Comida c3 = new Comida();
		c3.nome = "Bife";
		c3.peso = 0.405;
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Ana";
		p1.peso = 59.2;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Matheus";
		p2.peso = 82.89;
		
		System.out.println(p1.nome + " " + p1.peso);
		
		p1.comer(c2);
		
		System.out.println(p1.nome + " " + p1.peso);
		
	}
}
