package questao3;

public class Circulo {
	private double raio;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
	public double área() {
		double área = 3.14 * raio*raio;
		return área;
	}
	public double  circunferência() {
		double circo = 2*3.14 * raio;
		return circo;
	}
	public void aumentarcírculo(double valor) {
		this.raio =this.raio + (valor * this.raio)/100;
		System.out.println("Seu novo raio é: " + this.raio);
	}
}
