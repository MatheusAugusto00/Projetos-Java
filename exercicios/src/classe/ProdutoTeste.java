package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4536.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 100.00;

		Produto.desconto = 50;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Média do carrinho = R$%.2f.\n", mediaCarrinho);
		
		System.out.println(precoFinal2);
	}
}
 