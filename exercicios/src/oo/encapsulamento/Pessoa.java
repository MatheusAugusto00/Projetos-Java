package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sobreNome;
	
	public Pessoa(String nome,String sobreNome,int idade) {
		setIdade(idade);
		setNome(nome);
		setSobreNome(sobreNome);
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	
	public String getSobreNome() {
		return sobreNome;
	}



	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	//getter
	public int getIdade() {
		return idade;
	}
	
	//Setter
	public void setIdade(int novaIdade) {
		if(novaIdade >= 0) {
			this.idade = novaIdade;
		}
	}
	
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}

}
