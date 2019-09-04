package heranca3;

public class MillenniumFalcon extends Apolo11 {
	private float classeHiperpropulsor;

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		if(classeHiperpropulsor > 0)
			this.classeHiperpropulsor = classeHiperpropulsor;
	}
	
}
