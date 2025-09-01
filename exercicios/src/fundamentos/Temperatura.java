package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9;
		double farenheit = 89.6;
		
		double convercao = (farenheit-AJUSTE)*FATOR;
		
		System.out.println(farenheit+"°F é equivalente à "+convercao+"°C");
	}
}
