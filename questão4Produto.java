package questao4;

public class Produto {
	private String nome;
	private double custo;
	private double venda;
	private double lucro;
	private double despesa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public double getVenda() {
		return venda;
	}
	public void setVenda(double venda) {
		this.venda = venda;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public double getDespesa() {
		return despesa;
	}
	public void setDespesa(double despesa) {
		this.despesa = despesa;
	}
	
	public double CálculodaMargemdeLucros() {
		lucro = (venda -(custo + despesa))/venda;
		return lucro*100;
		
	}
}
