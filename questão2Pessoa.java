package questao2;
import java.util.Scanner;
public class Pessoa {
	Scanner leitor = new Scanner(System.in);
	private int idade;
	private int dia;
	private int mês;
	private int ano;
	private String nome;
	
	
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMês() {
		return mês;
	}
	public void setMês(int mês) {
		this.mês = mês;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void calculaIdade(int dia, int mês,int ano) {
		idade =ano - this.ano;
		if(mês<this.mês) {
			idade= idade-1;
		}
		else if(mês==this.mês && dia<this.dia) {
			idade = idade-1;
			
		}
	}
	public int informaIdade() {
		return this.idade;
	}
	public String informaNome(){
		
		
		return this.nome;
	}
	public void ajustaDataDeNascimento(int dia, int mês,int ano) {
		this.dia=dia;
		System.out.println("O dia de aniversário é: " + this.dia);
		this.mês=mês;
		System.out.println("O mês de aniversário é: " + this.mês);
		this.ano=ano;
		System.out.println("O ano de aniversário é: " + this.ano);
	}
}
