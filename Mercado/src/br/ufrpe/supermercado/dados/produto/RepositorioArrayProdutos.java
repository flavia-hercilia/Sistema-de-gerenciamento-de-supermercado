package br.ufrpe.supermercado.dados.produto;

import java.util.HashMap;
import java.util.Map;

import br.ufrpe.supermercado.negocio.Produto;

public class RepositorioArrayProdutos implements IRepositorioProdutos {

    public Map<String, Produto> produtos;

    public RepositorioArrayProdutos() {
        this.produtos = new HashMap<>();
    }

    @Override
    public void inserir(Produto produto) {
        produtos.put(produto.getEan(), produto); 
    }

    @Override
    public void listarProdutos() {

        for (String key : produtos.keySet()) {

            var value = produtos.get(key);
            System.out.println(
                    "Código de Barras: " + value.getEan() + "\nProduto: " + value.getNomeProduto() + "\nValor: R$ "
                            + value.getPreco());

        }
    }

    @Override
    public void remover(String ean) {
        produtos.remove(ean);
    }

    @Override
    public boolean buscarPorNomeProduto(String nomeProduto) {
        boolean result = false;
        for (String key : produtos.keySet()) {

            var valueNome = produtos.get(key).getNomeProduto().toUpperCase();
            if (nomeProduto.toUpperCase() == valueNome) {
                result = true;
            }
        }

        return result;
    }

}