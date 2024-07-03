package aula01;

public class Aula01 {

	public static void main(String[] args) {
		
		Caneta C1 = new Caneta();
		C1.modelo  = "BIC cristal";
		C1.cor = "Azul";
		//C1.ponta = 0.05f; privado 
		C1.carga = 80;
		// C1.tampada = false; privado
		C1.tampar();
		C1.status();
	}
}