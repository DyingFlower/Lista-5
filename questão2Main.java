package questao2;
import java.util.Scanner;
public class Main {
/* 2. Criar a classe Pessoa com as seguintes características:
● atributos: idade e dia, mês e ano de nascimento, nome da pessoa
● métodos: o calculaIdade(), que recebe a data atual em dias, mês e anos
e calcula e armazena no atributo idade a idade atual da pessoa o
informaIdade(), que retorna o valor da idade o informaNome(), que
retorna o nome da pessoa o ajustaDataDeNascimento(), que recebe dia,
mês e ano de nascimento como parâmetros e preenche nos atributos
correspondentes do objeto.
● Criar dois objetos da classe Pessoa, um representando Albert Einstein
(nascido em 14/3/1879) e o outro representando Isaac Newton (nascido
em 4/1/1643)
● Fazer uma classe principal que instancie os objetos, inicialize e mostre
quais seriam as idades de Einstein e Newton caso estivessem vivos. */
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Albert Einstein");
		p.ajustaDataDeNascimento(14, 3,1879);
		p.calculaIdade(7, 10,2022);
		System.out.println("A idade de: " + p.informaNome() + " nos dia de hoje seria: "+  p.informaIdade());

		
		Pessoa i = new Pessoa();
		i.setNome("Isaac Newton");
		i.ajustaDataDeNascimento(4, 1,1643);
		i.calculaIdade(7, 10,2022);
		System.out.println("A idade de: " + i.informaNome() + " nos dia de hoje seria: "+  i.informaIdade());
	}

}
