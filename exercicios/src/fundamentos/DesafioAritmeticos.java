package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		//int a = 3 * 4 - 10;
		//int b = (int)Math.pow(a, 3);
		
		//System.out.println(b);
		
		int a = 6*(3+2);
		int aDois = (int)Math.pow(a, 2);
		int aContinuacao = aDois/(3*2);
		
		int b = (1-5)*(2-7)/2;
		int bDois = (int)Math.pow(b, 2);
		
		int c = aContinuacao - bDois;
		int cTres = (int)Math.pow(c, 3);
		
		int d = (int)Math.pow(10, 3);
		
		int resultado = cTres/d;
		
		System.out.println("O resultado é: " + resultado);
	}
}
