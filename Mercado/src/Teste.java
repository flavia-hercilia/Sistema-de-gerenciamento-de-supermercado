// Classe de Teste

import java.util.Scanner;

import br.ufrpe.supermercado.dados.cliente.*;
import br.ufrpe.supermercado.dados.funcionario.*;
import br.ufrpe.supermercado.dados.produto.*;

//Apenas pra demonstrar como o "*" sintetiza nosso código.
//import br.ufrpe.supermercado.dados.cliente.IRepositorioClientes;
//import br.ufrpe.supermercado.dados.cliente.RepositorioArrayClientes;
//import br.ufrpe.supermercado.dados.funcionario.IRepositorioFuncionarios;
//import br.ufrpe.supermercado.dados.funcionario.RepositorioArrayFuncionarios;
//import br.ufrpe.supermercado.dados.produto.IRepositorioProdutos;
//import br.ufrpe.supermercado.dados.produto.RepositorioArrayProdutos;
import br.ufrpe.supermercado.negocio.*;
//import br.ufrpe.supermercado.negocio.Funcionario;
//import br.ufrpe.supermercado.negocio.Produto;

public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao mercadinho! \n################################");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        // controle menu
        boolean menu = true;

        IRepositorioClientes repositorioClientes = new RepositorioArrayClientes();
        IRepositorioFuncionarios repositorioFuncionarios = new RepositorioArrayFuncionarios();
        IRepositorioProdutos repositorioProdutos = new RepositorioArrayProdutos();

        while (menu) {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("[1] - Cliente");
            System.out.println("[2] - Produto");
            System.out.println("[3] - Funcionário");
            System.out.println("[4] - Sair do sistema");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.println("O que você deseja fazer com Cliente?");
                    System.out.println("[1] - Cadastrar Cliente");
                    System.out.println("[2] - Listar Clientes");
                    System.out.println("[3] - Alterar Cliente");
                    System.out.println("[4] - Deletar Cliente");
                    String clienteOption = scan.nextLine();

                    switch (clienteOption) {
                        case "1":
                            Cliente cliente = new Cliente();
                            cliente.cadastrarCliente(repositorioClientes);
                            break;
                        case "2":
                            repositorioClientes.listarClientes();
                            break;
                        case "3":
                            // Implementar a lógica para alterar cliente
                            System.out.println("Alterar Cliente não implementado ainda.");
                            break;
                        case "4":
                            // Implementar a lógica para deletar cliente
                            System.out.println("Deletar Cliente não implementado ainda.");
                            break;
                        default:
                            System.out.println("Opção inválida para Cliente!");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("O que você deseja fazer com Produto?");
                    System.out.println("[1] - Cadastrar Produto");
                    System.out.println("[2] - Listar Produtos");
                    System.out.println("[3] - Alterar Produto");
                    System.out.println("[4] - Deletar Produto");
                    String produtoOption = scan.nextLine();

                    switch (produtoOption) {
                        case "1":
                            Produto produto = new Produto();
                            produto.cadastrarProduto(repositorioProdutos);
                            break;
                        case "2":
                            // Implementar o método listarProdutos na classe RepositorioArrayProdutos
                            System.out.println("Listar Produtos não implementado.");
                            break;
                        case "3":
                            // Implementar a lógica para alterar produto
                            System.out.println("Alterar Produto não implementado ainda.");
                            break;
                        case "4":
                            // Implementar a lógica para deletar produto
                            System.out.println("Deletar Produto não implementado ainda.");
                            break;
                        default:
                            System.out.println("Opção inválida para Produto!");
                            break;
                    }
                    break;

                case "3":
                    System.out.println("O que você deseja fazer com Funcionário?");
                    System.out.println("[1] - Cadastrar Funcionário");
                    System.out.println("[2] - Listar Funcionários");
                    System.out.println("[3] - Alterar Funcionário");
                    System.out.println("[4] - Deletar Funcionário");
                    String funcionarioOption = scan.nextLine();

                    switch (funcionarioOption) {
                        case "1":
                            Funcionario funcionario = new Funcionario();
                            funcionario.cadastrarFuncionario(repositorioFuncionarios);
                            break;
                        case "2":
                            // Implementar o método listarFuncionarios na classe
                            // RepositorioArrayFuncionarios
                            System.out.println("Listar Funcionários não implementado.");
                            break;
                        case "3":
                            // Implementar a lógica para alterar funcionário
                            System.out.println("Alterar Funcionário não implementado ainda.");
                            break;
                        case "4":
                            // Implementar a lógica para deletar funcionário
                            System.out.println("Deletar Funcionário não implementado ainda.");
                            break;
                        default:
                            System.out.println("Opção inválida para Funcionário!");
                            break;
                    }
                    break;

                case "4":
                    menu = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (menu) {
                System.out.println("Pressione uma tecla para continuar");
                scan.nextLine();
            }
        }

        System.out.println("O programa se encerrou!");
    }
}