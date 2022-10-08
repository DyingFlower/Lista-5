package questao4;
import java.util.Scanner;
public class Main {
/* 4. Crie uma classe Produto, essa classe deverá conter os seguintes
atributos: nome do produto, preço de custo, preço de venda, margem de
lucro e despesas da empresa. E o método: Cálculo da Margem de Lucros.
OBS: Cálculo da Margem de Lucro: Margem de Lucro = {[PV – (PC + D)] / PV]}
x 100. Com - PC= Preço de Custo, PV= Preço de Venda, D= Despesas.
Por fim, no método main(), crie um novo objeto da classe Produto, peça para o
usuário informar o nome, os preços de custo e de venda e exiba a margem de
lucro em porcentagem. */
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	Produto p = new Produto();
	System.out.println("Escreva o nome do produto, os preços de custo e de venda do produto: ");
	p.setNome(leitor.next());
	System.out.println("Nome do produto: " + p.getNome());
	p.setCusto(leitor.nextDouble());
	System.out.println("Custo: " + p.getCusto());
	p.setVenda(leitor.nextDouble());
	System.out.println("Custo de venda: " + p.getVenda());
	// não entendi direito esse cálculo da margem de lucro, não fez sentido pra mim.
	System.out.println("O lucro de sua empresa será: "+ p.CálculodaMargemdeLucros() );
	leitor.close();
	
	
	
	}

}
