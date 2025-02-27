package supermercado;

public class Pedido {
    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private Cliente cliente;
    
    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    // Fecha o pedido, exibindo informações relevantes
    public void fecharPedido() {
        // Imprime o número do pedido
        System.out.println("Número do pedido: " + numeroPedido);
        
        // Imprime o nome do cliente
        System.out.println("Cliente: " + cliente.getNome());
        
        // Imprime os produtos do carrinho com suas descrições
        System.out.println("Produtos:");
        for (Produto produto : carrinho.getProdutos()) {
            System.out.println("- " + produto.getNome() + ": " + produto.getQuantidade() + "x");
        }
        
        // Calcula e imprime o total do pedido formatado como moeda
        System.out.printf("Total do pedido: R$ %.2f%n", this.carrinho.calcularTotal());
        
        // Imprime uma linha de separação
        System.out.println("=====================================");

        // Adiciona descrição informando que o pedido foi fechado com sucesso
        System.out.println("Pedido fechado com sucesso!");
    }
    
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }    
}