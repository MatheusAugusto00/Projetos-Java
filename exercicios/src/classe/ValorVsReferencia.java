package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a =2;
		double b = a; //Atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		d1.imprimiDataFormatada();
		d2.imprimiDataFormatada();
		
		voltarDataParaValorPadrao(d2);
		
		d1.imprimiDataFormatada();
		d2.imprimiDataFormatada();
		
		int c = 5;
		alteraPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia=1;
		d.mes=1;
		d.ano=1970;
	}
	static void alteraPrimitivo(int c) {
		c++;
	}
}
