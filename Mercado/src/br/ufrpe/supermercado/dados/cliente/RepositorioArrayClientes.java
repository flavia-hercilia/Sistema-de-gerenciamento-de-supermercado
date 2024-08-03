package br.ufrpe.supermercado.dados.cliente;
// import java.util.Dictionary;
// import java.util.Hashtable;

// Implementação do Repositório de Clientes

import br.ufrpe.supermercado.negocio.Cliente;

public class RepositorioArrayClientes implements IRepositorioClientes {
    
    //mudanças
    //private Dictionary<Integer, Cliente> clientes;
    private Cliente[] clientes;
    private int tamanhoAtual;

    public RepositorioArrayClientes() {
        this.clientes = new Cliente[100];
        this.tamanhoAtual = 0;
    }
    
    private void redimensionarArray() {
        Cliente[] novoArray = new Cliente[clientes.length * 2];
        for (int i = 0; i < clientes.length; i++) {
            novoArray[i] = clientes[i];
        }
        clientes = novoArray;
    }
    
    public void inserir(Cliente cliente){
        if(tamanhoAtual == clientes.length){
            redimensionarArray();
        }
        clientes[tamanhoAtual] = cliente;
        tamanhoAtual++;
    }

    @Override
    public void listarClientes() {

        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(clientes[i]);
        }
        
    }

    
    // public RepositorioArrayClientes() {
    //     this.clientes = new Hashtable<>();
    // }
    
    // @Override
    // public void inserir(Cliente cliente) {
    //     clientes.put(cliente.getCPF(), cliente);
    // }
    
    // @Override
    // public Cliente buscarPorCPF(long cpfConsulta) {
    //     return null;

    // }

    //fimMudanças


    
}