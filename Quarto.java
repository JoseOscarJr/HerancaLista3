package heranca3;

public class Quarto extends Ambiente {
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if(capacidade > 0)
			this.capacidade = capacidade;
	}
	
}
