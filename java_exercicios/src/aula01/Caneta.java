package aula01;

public class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status () {
		System.out.println("Modelo "+ this.modelo);
		System.out.println("Uma caneta "+ this.cor );
		System.out.println("Ponta "+ this.ponta );
		System.out.println("Carga "+ this.carga);
		System.err.println("Está tampada?"+ this.tampada);
	}

	void rabiscar () {
		if (this.tampada == true) {
			System.out.println("ERRO! não posso rabiscar");
		}else {
			System.out.println("Estou rabiscando");
			
		}
	}

	void tampar () {
		this.tampada = true;
	}
	
	void destampar () {
		this.tampada = false;
	}
}