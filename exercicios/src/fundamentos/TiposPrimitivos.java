package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//Tipos numéricos inteiros.
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 547;
		int id = 31243;
		long pontosAcumulados = 3_321_313_123L;
		
		//Tipos númericos reais.
		
		float salario = 11_445.34F;
		double vendasAcumuladas = 2_991_997_103.79;
		
		//Tipos booleanos.
		
		boolean estaDeFerias = false;
		
		//tipo caractere
		
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		
		System.out.println("Ferias? "+estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
