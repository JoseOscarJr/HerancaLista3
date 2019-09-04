package heranca3;

public class Ambiente {
	private float area;

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		if(area > 0)
			this.area = area;
	}
	
}
