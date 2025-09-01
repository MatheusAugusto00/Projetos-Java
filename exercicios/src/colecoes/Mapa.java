package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Rafaela");
		usuarios.put(3, "Rebeca");
		usuarios.put(2, "Ricardo");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		
		System.out.println(usuarios.get(20));
		
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println(usuarios.remove(4));
		//  for(Entry<Integer,String> registro: usuarios.entrySet()) {
		//	System.out.println(registro.getKey());
		// }
		
	}
}
