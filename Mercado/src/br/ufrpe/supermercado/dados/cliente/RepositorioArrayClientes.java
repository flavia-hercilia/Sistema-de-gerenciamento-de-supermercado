package br.ufrpe.supermercado.dados.cliente;
// import java.util.Dictionary;
// import java.util.Hashtable;

// import java.util.ArrayList;

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

    @Override
    public void remover(String cpf) {        
        int currentLength = clientes.length;
        for (int i = 0; i < currentLength; i++) {
            if (clientes[i].getCPF().equals(cpf)){
                clientes[i] = clientes[currentLength - 1];
                currentLength--;
                break; 
            }

            if (i == currentLength - 1) {
            System.out.println("Cliente nao cadastrado!");
            }
        }
    }

    @Override
    public boolean buscarPorCPF(String cpfConsulta) {
        if(cpfConsulta.length() != 11){
            return false;
        }else{
            int currentLength = clientes.length;
            for (int i = 0; i < currentLength; i++) {
                if (clientes[i].getCPF().equals(cpfConsulta)){
                    return true;                     
                }  
                
            }
            return false;
        }
    } 
    


    
}