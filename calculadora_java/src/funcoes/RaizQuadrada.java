package funcoes;

public class RaizQuadrada {
	double a,b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double getRaizQuadrada() {
		
		return Math.round(Math.sqrt(a)*100)/100.0;
	}
}
