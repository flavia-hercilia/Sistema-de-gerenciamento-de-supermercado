package br.ufrpe.supermercado.dados.produto;

// Implementação do Repositório de Produtos

// import java.util.Dictionary;
// import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

import br.ufrpe.supermercado.negocio.Produto;

public class RepositorioArrayProdutos implements IRepositorioProdutos{
    
    
    public Map<String, Produto> produtos;

    public RepositorioArrayProdutos() {
        this.produtos = new HashMap<>();
    }

    @Override
    public void inserir(Produto produto) {
        produtos.put(produto.getNomeProduto(), produto);
    }
}