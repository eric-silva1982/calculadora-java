package funcoes;

public class Divisao {
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



	public double getDivisao(){
		 
		return Math.round(a/b*100)/100.0;
	}
}