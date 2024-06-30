	package comanda;

	import java.util.ArrayList;
	import java.util.List;

	public class Cliente {
	    private String nome;
	    private List<Float> gastos;

	    public Cliente(String nome) {
	        this.nome = nome;
	        this.gastos = new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public List<Float> getGastos() {
	        return gastos;
	    }

	    public void adicionarGasto(float valor) {
	        this.gastos.add(valor);
	    }

	    public float calcularTotalGasto() {
	        float total = 0;
	        for (float valor : gastos) {
	            total += valor;
	        }
	        return total;
	    }
	}