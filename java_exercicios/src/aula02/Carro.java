package aula02;

public  class Carro {

	String marca;
	String modelo;
	int ano;
	


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}	
	void exibirDetalhes() {
		System.out.println("\nMarca " + marca);
		System.out.println("\nModelo " + modelo);
		System.out.println("\nAno " + ano);
}
}