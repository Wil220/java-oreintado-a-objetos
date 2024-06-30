
	package comanda;

	import java.util.ArrayList;
	import java.util.List;

	public class Comanda {
	    private List<Cliente> clientes;

	    public Comanda() {
	        this.clientes = new ArrayList<>();
	    }

	    public void adicionarCliente(String nome) {
	        Cliente cliente = new Cliente(nome);
	        this.clientes.add(cliente);
	        System.out.println("Cliente " + nome + " foi adicionado com sucesso!");
	    }

	    public Cliente encontrarCliente(String nome) {
	        for (Cliente cliente : clientes) {
	            if (cliente.getNome().equalsIgnoreCase(nome)) {
	                return cliente;
	            }
	        }
	        return null;
	    }

	    public void registrarGasto(String nome, float valor) {
	        Cliente cliente = encontrarCliente(nome);
	        if (cliente != null) {
	            cliente.adicionarGasto(valor);
	            System.out.println("Gasto de R$ " + valor + " registrado para o cliente " + nome);
	        } else {
	            System.out.println("Cliente " + nome + " não encontrado.");
	        }
	    }

	    public void exibirInformacoes(String nome) {
	        Cliente cliente = encontrarCliente(nome);
	        if (cliente != null) {
	            System.out.println("Informações do cliente " + nome + ":");
	            System.out.println("Valores gastos: " + cliente.getGastos());
	            System.out.println("Total gasto: R$ " + cliente.calcularTotalGasto());
	        } else {
	            System.out.println("Cliente " + nome + " não encontrado.");
	        }
	    }

	    public void listarClientes() {
	        if (clientes.isEmpty()) {
	            System.out.println("Nenhum cliente cadastrado.");
	        } else {
	            System.out.println("Clientes cadastrados:");
	            for (Cliente cliente : clientes) {
	                System.out.println("Nome: " + cliente.getNome());
	            }
	        }
	    }
	}
