package heranca3;

public class Apolo11 extends NaveEspacial {
	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if(tipoCombustivel.length() > 0)
			this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
