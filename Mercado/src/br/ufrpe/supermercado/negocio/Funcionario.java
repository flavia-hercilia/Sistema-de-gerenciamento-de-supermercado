package br.ufrpe.supermercado.negocio;
import java.util.Scanner;
import java.util.logging.Level;
//import java.util.Dictionary;
//import java.util.Hashtable;
import java.util.logging.Logger;

import br.ufrpe.supermercado.dados.funcionario.IRepositorioFuncionarios;
import br.ufrpe.supermercado.excecoes.CpfInvalidoExcecao;

// Classe Funcionario que herda de Pessoa
public class Funcionario extends Pessoa{

    public void cadastrarFuncionario(IRepositorioFuncionarios repositorioFuncionarios) {      
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();
        System.out.println("Digite a data de nascimento: ");
        int data = scan.nextInt();

        Funcionario funcionario = null;
        boolean isFuncionarioValido = true;
        
        try {
            funcionario = new Funcionario();
            funcionario.setNomeCompleto(nome);
            funcionario.setCPF(cpf);
            funcionario.setDataNascimento(data);
        }catch (CpfInvalidoExcecao ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null,ex);
            isFuncionarioValido = false;
        }

        if (isFuncionarioValido) {
            repositorioFuncionarios.inserir(funcionario);
            System.out.println("Funcionário " + funcionario.getNomeCompleto() + " cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar o funcionário devido a um CPF inválido.");
        }
        
        // scan.close();
    }

    public String removerFuncionario(IRepositorioFuncionarios repositorioFuncionarios){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o CPF do funcionário para remover: ");
        String itemRm = scan.nextLine();

        if(repositorioFuncionarios.buscarPorCPF(itemRm) == true){
            
            repositorioFuncionarios.remover(itemRm);
            return "Funcionário de CPF " + itemRm + " foi removido com sucesso!";
        }else{
            return "CPF incorreto ou Funcionário não está cadastrado!";
        }      

        // scan.close();

        
        
        
    }
}