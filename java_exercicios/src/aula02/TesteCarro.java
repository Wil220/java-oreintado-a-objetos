package aula02;

public class TesteCarro {

	public static void main(String[] args) {

		Carro meuCarro = new Carro();


		meuCarro.setMarca("Honda");
		meuCarro.setModelo("Civic");
		meuCarro.setAno(2021);

		meuCarro.exibirDetalhes();


		System.out.println("Marca obtida: " + meuCarro.getMarca());
	}
}

