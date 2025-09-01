package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial,double valorInicial){
		nome = nomeInicial;
		preco = valorInicial;

	}
	

	double precoComDesconto(double descontoDoGerente) {	
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	double precoComDesconto() {	
		return preco * (1 - desconto);
	}
}
