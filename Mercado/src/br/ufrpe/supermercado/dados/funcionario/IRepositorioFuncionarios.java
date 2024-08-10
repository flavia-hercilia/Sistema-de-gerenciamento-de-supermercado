package br.ufrpe.supermercado.dados.funcionario;
// Interface para Repositório de Funcionários

import br.ufrpe.supermercado.negocio.Funcionario;

public interface IRepositorioFuncionarios {
    void inserir(Funcionario funcionario);
    void remover(String cpf);
    void listarFuncionarios();
    
    boolean buscarPorCPF(String cpfConsulta);
    
}