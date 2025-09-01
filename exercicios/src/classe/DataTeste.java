package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data hoje = new Data();
		hoje.dia = 7;
		hoje.mes = 5;
		hoje.ano = 2025;
		
		Data amanha = new Data(8,5,2025);

		
		Data d1 = new Data();
		
		d1.imprimiDataFormatada();
		
		System.out.println(hoje.obterDataFormatada());
		amanha.imprimiDataFormatada();
	}
}
