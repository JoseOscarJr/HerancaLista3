package heranca3;

public class NaveEspacial {
	private double velocidadeMaxima;

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		if(velocidadeMaxima > 0)
			this.velocidadeMaxima = velocidadeMaxima;
	}
	
}
