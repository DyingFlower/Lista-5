package questao3;
import java.util.Scanner;
public class Main {
/* 3. Crie uma classe Círculo para representar círculos. Esta classe deverá
conter o seguinte atributo: raio e os métodos: área, circunferência,
aumentar círculo.
OBS: no método aumentar círculo, receba um valor double e use-o como
percentual para aumentar o raio do círculo.
Por fim, no método main(), crie um novo objeto da classe Círculo, peça para o
usuário informar o raio e retorne a área e a circunferência. Peça também o
percentual de aumento do raio e retorne a nova área e a nova circunferência.
OBS: Defina o pi como 3,14. */
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("Informe o raio do círculo: ");
	double raio = leitor.nextDouble();
	Circulo c = new Circulo();
	c.setRaio(raio);
	System.out.println("A área de seu círculo é: "+ c.área() + " sua circunferência é: "+ c.circunferência());
	System.out.println("Diga o percentual que deseja aumentar seu raio: ");
	double percentual = leitor.nextDouble();
	c.aumentarcírculo(percentual);
	System.out.println("A nova área de seu círculo é: "+ c.área() + " sua circunferência é: "+ c.circunferência());
	
	
	
	leitor.close();
	}

}
