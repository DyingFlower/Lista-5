package questao1;
import java.util.Scanner;
public class Main {
/* 1. Crie uma classe Controle Remoto que pode controlar o volume e trocar os
canais da televisão. O controle de volume permite:
● aumentar ou diminuir a potência do volume de som em uma unidade de
cada vez
● aumentar e diminuir o número do canal em uma unidade trocar para um
canal indicado
● consultar o valor do volume de som e o canal selecionado */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ControleRemoto c = new ControleRemoto();
		c.setVolume(0);
		c.setCanal(0);
		System.out.println("que canal deseja colocar sua TV? :");
		int canal = leitor.nextInt();
		c.setCanal(canal);
		System.out.println("Se desejar aumentar o canal aperte +, quando acabar digite sair, se pretende trocar numero do canal digite trocar");
		c.aumentacanal(canal); // codigo está dando erro ao passar dessa parte, não entendi o que está causando o erro.
		System.out.println("Digite o volume desejado, coloque no volume certo usando + e - mas cuidado com problemas de audição");
		int volume = leitor.nextInt();
		c.setVolume(volume);
		c.aumentavolume(volume);

		leitor.close();
		
	}

}
