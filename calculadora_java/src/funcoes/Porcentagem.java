package funcoes;


public class Porcentagem {
	public double a,b;
	
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

	public double getPorcentagem() {
		
        double resultado = Math.round(a * (b / 100) * 100) / 100.0;


        return resultado;
		
	
	}
	
}
