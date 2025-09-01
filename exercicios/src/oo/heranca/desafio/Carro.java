package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	private int delta = 5;
	
	final int VELOCIDADE_MAXIMA;
	
	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public boolean frear() {
		if(this.velocidadeAtual >= 5) {
			velocidadeAtual-=5;
			return true;
		}else {
			velocidadeAtual = 0;
			return false;
		}
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual+=getDelta();
		}


	}
	
	public String toString() {
		return "Velocidade atual é: " + velocidadeAtual+"Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
