package tp1;

public class Peaje {
	private String lugar;
	private double importe;

	public Peaje(){}
	
	public Peaje(String lugar, double importe) {
		super();
		this.lugar = lugar;
		this.importe = importe;
	}
	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
}
