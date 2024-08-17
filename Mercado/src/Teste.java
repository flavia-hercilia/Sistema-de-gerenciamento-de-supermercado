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
        
        //mudado de lugar teste
        Funcionario funcionario = new Funcionario();
        Cliente cliente = new Cliente();

        while (menu) {
            
            System.out.println("Escolha uma opção: \n1- Área Cliente \n2- Área Funcionário \n3- Área Produto \n4- Vendas \n5- Sair");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Escolha uma opção: \n1- Cadastro de cliente \n2- Listar clientes \n3- Remover cliente" + //
                                        "\n4- Voltar");
                    String optionC = scan.nextLine();
                    switch (optionC) {
                        case "1":                            
                            cliente.cadastrarCliente(repositorioClientes);
                            break;
                        case "2":
                            repositorioClientes.listarClientes();
                            break;
                        case "3":                            
                            System.out.println(cliente.removerCliente(repositorioClientes));                            
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Escolha uma opção: \n1- Cadastro de funcionario \n2- Listar funcionarios \n3- Remover funcionario" + //
                                        "\n4- Voltar");
                    String optionF = scan.nextLine();
                    switch (optionF) {
                        case "1":
                            funcionario.cadastrarFuncionario(repositorioFuncionarios);
                            break;
                        case "2":
                            repositorioFuncionarios.listarFuncionarios();
                            break;
                        case "3":
                            System.out.println(funcionario.removerFuncionario(repositorioFuncionarios));
                            break;
                        default:
                            // volta pro menu anterior
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Escolha uma opção: \n1- Cadastro de produto \n2- Listar produtos \n3- Remover produto" + //
                                        "\n4- Voltar");
                    String optionP = scan.nextLine();
                    switch (optionP) {
                        case "1":
                            Produto produto = new Produto();
                            produto.cadastrarProduto(repositorioProdutos);
                            break;
                        case "2":
                            repositorioProdutos.listarProdutos();
                            break;
                        case "3":
                            //remover produtos 
                            break;
                        default:
                            break;
                    }
                    break;

                case "4":
                    System.out.println("Escolha uma opção: \n1-Nova venda \n2- Número de vendas \n3- Histórico \n4- Voltar");
                    String optionV = scan.nextLine();
                    switch (optionV) {
                        case "1":                            
                            //nova venda
                        case "2":
                            //numero de vendas
                        case "3":
                            //historico de vendas
                        default:
                            break;
                    }
                    break;

                case "5":
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

           
            System.out.println("Pressione uma tecla para continuar");
            scan.nextLine();
            
        }

        System.out.println("O programa se encerrou!");
        scan.close();

                
    }
}


