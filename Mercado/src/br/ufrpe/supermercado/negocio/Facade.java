package br.ufrpe.supermercado.negocio;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.ufrpe.supermercado.dados.cliente.RepositorioArrayClientes;
import br.ufrpe.supermercado.dados.funcionario.RepositorioArrayFuncionarios;
import br.ufrpe.supermercado.dados.produto.RepositorioArrayProdutos;
import br.ufrpe.supermercado.excecoes.CampoVazioExcecao;
import br.ufrpe.supermercado.excecoes.CpfInvalidoExcecao;

public class Facade {

    private RepositorioArrayClientes repositorioClientes;
    private RepositorioArrayFuncionarios repositorioFuncionarios;
    private RepositorioArrayProdutos repositorioProdutos;
    
    public Facade() {
        this.repositorioClientes = new RepositorioArrayClientes();
        this.repositorioFuncionarios = new RepositorioArrayFuncionarios();
        this.repositorioProdutos = new RepositorioArrayProdutos();
    }
    
    //CLIENTE


    public void cadastrarCliente() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF(xxx.xxx.xxx-xx): "); // Acrescentei "(xxx.xxx.xxx-xx)"
        String cpf = scan.nextLine();
        System.out.println("Digite o ano nascimento(yyyy): "); // O entre parenteses estava invertido com dia.
        int ano = scan.nextInt();
        System.out.println("Digite o mes nascimento(mm): ");
        int mes = scan.nextInt();
        System.out.println("Digite o dia nascimento(dd): "); // O entre parenteses estava invertido com ano.
        int dia = scan.nextInt();

        LocalDate data = LocalDate.of(ano, mes, dia);

        Cliente cliente = null;
        boolean isClienteValido = true;

        try {
            cliente = new Cliente();
            cliente.setNomeCompleto(nome);
            cliente.setDataNascimento(data);
            cliente.setCPF(cpf);
        } catch (CpfInvalidoExcecao ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            isClienteValido = false;
        }

        if (isClienteValido) {
            repositorioClientes.inserir(cliente);
            System.out.println("Cliente " + cliente.getNomeCompleto() + " cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar o cliente devido a um CPF inválido.");
        }
    }

    public String removerCliente() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o cpf do cliente para remover(apenas números): "); // Estava escrito: "funcionario"
        String itemRm = scan.nextLine();

        if (repositorioClientes.buscarPorCPF(itemRm) == true) {

            repositorioClientes.remover(itemRm);
            return "Cliente de cpf " + itemRm + " foi removido com sucesso!"; // Estava escrito: "Funcionario"
        } else {
            return "Cpf incorreto ou Cliente não está cadastrado!"; // Estava escito: Funcionario
        }
    }

    public void listarClientes(){
        repositorioClientes.listarClientes();
    }
    
    //FUNCIONARIO

    public void cadastrarFuncionario() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();
        System.out.println("Digite o ano nascimento(yyyy): "); // Estava nos parenteses (dd)
        int ano = scan.nextInt();
        System.out.println("Digite o mes nascimento(mm): ");
        int mes = scan.nextInt();
        System.out.println("Digite o dia nascimento(dd): "); // Estava nos parenteses (yyyy)
        int dia = scan.nextInt();
        
        LocalDate data = LocalDate.of(ano, mes, dia);

        Funcionario funcionario = null;
        boolean isFuncionarioValido = true;

        try {
            funcionario = new Funcionario();
            funcionario.setNomeCompleto(nome);
            funcionario.setCPF(cpf);
            funcionario.setDataNascimento(data);
        } catch (CpfInvalidoExcecao ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            isFuncionarioValido = false;
        }

        if (isFuncionarioValido) {
            repositorioFuncionarios.inserir(funcionario);
            System.out.println("Funcionário " + funcionario.getNomeCompleto() + " cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar o funcionário devido a um CPF inválido.");
        }
    }

    public String removerFuncionario() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o CPF do funcionário para remover: ");
        String itemRm = scan.nextLine();

        if (repositorioFuncionarios.buscarPorCPF(itemRm) == true) {

            repositorioFuncionarios.remover(itemRm);
            return "Funcionário de CPF " + itemRm + " foi removido com sucesso!";
        } else {
            return "CPF incorreto ou Funcionário não está cadastrado!";
        }
    }

    public void listarFuncionarios(){
        repositorioFuncionarios.listarFuncionarios();
    }


    //PRODUTOS

    public void cadastrarProduto() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o codigo de barras(ean) do produto: "); // Coloquei o ean p/aparecer 1º.
        String ean = scan.nextLine();
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scan.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        scan.nextLine();

        try {
            if (nomeProduto.trim().isEmpty()) {
                throw new CampoVazioExcecao("O nome do produto não pode estar vazio.");
            }
            if (preco <= 0) {
                throw new CampoVazioExcecao("O preço do produto deve ser maior que zero.");
            }

            Produto produto = new Produto();
            produto.setEan(ean); // tbm subi ean aqui
            produto.setNomeProduto(nomeProduto);
            produto.setPreco(preco);

            repositorioProdutos.inserir(produto);

            System.out.println("Produto " + produto.getNomeProduto() + " cadastrado com sucesso!"); // Add print prod

        } catch (CampoVazioExcecao ex) {
            System.err.println("Erro ao cadastrar produto: " + ex.getMessage());
        }
    }

    public String removerProduto() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do Produto para remover: ");
        String itemRm = scan.nextLine();

        if (repositorioProdutos.buscarPorNomeProduto(itemRm) == true) {

            repositorioProdutos.remover(itemRm);
            return "Produto " + itemRm + " foi removido com sucesso!";
        } else {
            return "Nome incorreto ou Produto não está cadastrado!"; 
        }
    }

    public void listarProdutos(){
        repositorioProdutos.listarProdutos();
    }


}

