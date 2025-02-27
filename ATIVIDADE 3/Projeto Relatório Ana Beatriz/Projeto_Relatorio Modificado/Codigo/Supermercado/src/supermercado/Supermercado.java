package supermercado;

public class Supermercado {

    // Método principal para teste
    public static void main(String[] args) {

        // Cria um carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto("Arroz", 1, 3.99);
        carrinho.adicionarProduto("Filé de frango sassami", 2, 21.99);

        // Calcula o total do carrinho
        carrinho.calcularTotal();

        // Cria um cliente
        Cliente cliente = new Cliente("João", "123.456.789-00", "joao@example.com");

        // Cria um pedido
        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(1);
        pedido.setCarrinho(carrinho);
        pedido.setCliente(cliente);

        // Fecha o pedido
        pedido.fecharPedido();

    }
}