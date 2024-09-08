package br.ufrpe.supermercado.dados.venda;

import br.ufrpe.supermercado.negocio.*;

public interface IRepositorioVendas {
    void registrarVenda(Venda venda);
    void listarVendas();


}
