package br.ufrpe.supermercado.dados.cliente;
// Interface para Repositório de Clientes

import br.ufrpe.supermercado.negocio.Cliente;

public interface IRepositorioClientes {
    void inserir(Cliente cliente);
    void remover(String cpf);
    void listarClientes();

    boolean buscarPorCPF(String cpfConsulta);
}