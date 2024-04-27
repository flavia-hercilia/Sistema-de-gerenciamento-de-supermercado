// Classe de Teste

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao mercadinho! \n################################");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        //controle menu
        boolean menu = true;
        
        IRepositorioClientes repositorioClientes = new RepositorioArrayClientes();
        IRepositorioFuncionarios repositorioFuncionarios = new RepositorioArrayFuncionarios();
        IRepositorioProdutos repositorioProdutos = new RepositorioArrayProdutos();
        
        //mudado de lugar teste
        Funcionario funcionario = new Funcionario();

        while (menu) {
            System.out.println("Escolha uma opção: \n1- Cadastro de cliente \n2- Cadastro de produtos \n3- Cadastro funcionários" + //
                                "\n4- Remover funcionario  \n5- Listar clientes \n6- Sair");
            String option = scan.nextLine();
            switch (option) {
                case "1":
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente(repositorioClientes);
                    break;           
    
                case "2":
                    Produto produto = new Produto();
                    produto.cadastrarProduto(repositorioProdutos);
                    break;
                
                case "3":
                    funcionario.cadastrarFuncionario(repositorioFuncionarios);
                    break;
                case "4":
                    System.out.println(funcionario.removerFuncionario(repositorioFuncionarios));
                    break;
                case "5":
                    repositorioClientes.listarClientes();
                    break;
                case "6":
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
        //scan.close();
    }
}
