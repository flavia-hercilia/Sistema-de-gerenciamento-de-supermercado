package br.ufrpe.supermercado.dados.funcionario;

import java.util.HashMap;
import java.util.Map;

import br.ufrpe.supermercado.negocio.Funcionario;

public class RepositorioArrayFuncionarios implements IRepositorioFuncionarios {
    
    public Map<String, Funcionario> funcionarios;

    public RepositorioArrayFuncionarios() {
        this.funcionarios = new HashMap<>();
    }

    @Override
    public void inserir(Funcionario funcionario) {
        funcionarios.put(funcionario.getCPF(), funcionario);
    }

    @Override
    public boolean buscarPorCPF(String cpfConsulta) {
        if(cpfConsulta.length() != 11 || funcionarios.containsKey(cpfConsulta) == false){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void remover(String cpf) {
        funcionarios.remove(cpf);
    }

    @Override
    public void listarFuncionarios() {

        for (String key : funcionarios.keySet()) {

            var value = funcionarios.get(key);
            System.out.println("Nome funcionario: " + value.getNomeCompleto() + "\nCPF: " + value.getCPF());
     }
    }
}