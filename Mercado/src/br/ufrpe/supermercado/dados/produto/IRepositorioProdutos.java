package br.ufrpe.supermercado.dados.produto;

// Interface para Repositório de Produtos

import br.ufrpe.supermercado.negocio.*;

public interface IRepositorioProdutos  {
    void inserir(Produto produto);
    // void remover(String nomePoduto);
    void listarProdutos();
}