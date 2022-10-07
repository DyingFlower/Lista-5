package questao1;

import java.util.Scanner;

public class ControleRemoto {
	Scanner leitor = new Scanner(System.in);
	private int volume;
	private int canal;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume=volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public void aumentavolume(int volume) {
		String aumentar = leitor.next();
		while(!(aumentar.equals("sair"))) {
			if(aumentar.equals("+")) {
				this.volume=volume+1;
				System.out.println("Volume: "+ this.volume);
				volume++;
			}
			else if(aumentar.equals("-")) {
				this.volume=volume-1;
				System.out.println("Volume: "+ this.volume);
				volume--;
			}
			aumentar = leitor.next();
		}
	}
	public void aumentacanal(int canal) {
		String aumentar = leitor.next();
		while(!(aumentar.equals("sair"))) {
			if(aumentar.equals("trocar")) {
				canal=leitor.nextInt();
				this.canal=canal;
				System.out.println("Canal: " + this.canal);
			}
			else if(aumentar.equals("+")) {
				this.canal=canal+1;
				System.out.println("Canal: " + this.canal);
				canal++;
			}
			else if(aumentar.equals("-")) {
				this.canal=canal-1;
				System.out.println("Canal: " + this.canal);
				canal--;
			}
			aumentar = leitor.next();
			
		}
	}
	
}
