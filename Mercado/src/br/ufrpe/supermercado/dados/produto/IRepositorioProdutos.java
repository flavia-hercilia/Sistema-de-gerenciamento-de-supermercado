package br.ufrpe.supermercado.dados.produto;

import br.ufrpe.supermercado.negocio.*;

public interface IRepositorioProdutos  {
    void inserir(Produto produto);
    void remover(String ean);
    void listarProdutos();


    boolean buscarPorNomeProduto(String nomeProduto);
}