package supermercado;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    // Adiciona um produto ao carrinho
    public void adicionarProduto(String nome, int quantidade, double precoUnitario) {
        this.produtos.add(new Produto(nome, quantidade, precoUnitario));
    }

    // Calcula o total dos produtos no carrinho
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getQuantidade() * produto.getPrecoUnitario();
        }
        return total;
    }
    
    // Retorna a lista de produtos do carrinho
    public List<Produto> getProdutos() {
        return produtos;
    }
}