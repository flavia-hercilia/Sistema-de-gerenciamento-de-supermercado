package br.ufrpe.supermercado.negocio;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.ufrpe.supermercado.dados.cliente.IRepositorioClientes;
// import br.ufrpe.supermercado.dados.funcionario.IRepositorioFuncionarios;
import br.ufrpe.supermercado.excecoes.CpfInvalidoExcecao;

// Classe Cliente que herda de Pessoa
public class Cliente extends Pessoa{

    public String toString() {
        return "Cliente: " + getNomeCompleto() + "\n"
                + "CPF: " + getCPF() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n";
    }

    public void cadastrarCliente(IRepositorioClientes repositorioClientes) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();
        System.out.println("Digite a data de nascimento: ");
        int data = scan.nextInt();

        Cliente cliente = null;
        boolean isClienteValido = true;
        
        try {
            cliente = new Cliente();
            cliente.setNomeCompleto(nome);
            cliente.setDataNascimento(data);
            cliente.setCPF(cpf);
        }catch (CpfInvalidoExcecao ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null,ex);
            isClienteValido = false;
        }

        if (isClienteValido) {
            repositorioClientes.inserir(cliente);
            System.out.println("Cliente " + cliente.getNomeCompleto() + " cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar o cliente devido a um CPF inválido.");
        }
        

        //scan.close();
    }

    public String removerCliente(IRepositorioClientes repositorioClientes){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o cpf do funcionario para remover: ");
        String itemRm = scan.nextLine();

        if(repositorioClientes.buscarPorCPF(itemRm) == true){
        
            repositorioClientes.remover(itemRm);
            return "Funcionario de cpf " + itemRm + " foi removido com sucesso!";
        }else{
            return "Cpf incorreto ou Funcionario nao esta cadastrado!";
        }
    }

    
}