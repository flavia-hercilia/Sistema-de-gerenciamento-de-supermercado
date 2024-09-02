// Classe de Teste

import java.util.Scanner;

import br.ufrpe.supermercado.negocio.Facade;

public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao mercadinho! \n################################");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        // controle menu
        boolean menu = true;

        Facade fachada = new Facade();

        while (menu) {

            System.out.println(
                    "Escolha uma opção: \n1- Área Cliente \n2- Área Funcionário \n3- Área Produto \n4- Vendas \n5- Sair");

            String option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.println(
                            "Escolha uma opção: \n1- Cadastro de cliente \n2- Listar clientes \n3- Remover cliente" + //
                                    "\n4- Voltar");
                    String optionC = scan.nextLine();
                    switch (optionC) {
                        case "1":
                            fachada.cadastrarCliente();
                            break;
                        case "2":
                            fachada.listarClientes();
                            break;
                        case "3":
                            fachada.removerCliente();
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.println(
                            "Escolha uma opção: \n1- Cadastro de funcionario \n2- Listar funcionarios \n3- Remover funcionario"
                                    + //
                                    "\n4- Voltar");
                    String optionF = scan.nextLine();
                    switch (optionF) {
                        case "1":
                            fachada.cadastrarFuncionario();
                            break;
                        case "2":
                            fachada.listarFuncionarios();
                            break;
                        case "3":
                            fachada.removerFuncionario();
                            break;
                        default:
                            // volta pro menu anterior
                            break;
                    }
                    break;
                case "3":
                    System.out.println(
                            "Escolha uma opção: \n1- Cadastro de produto \n2- Listar produtos \n3- Remover produto" + //
                                    "\n4- Voltar");
                    String optionP = scan.nextLine();
                    switch (optionP) {
                        case "1":
                            fachada.cadastrarProduto();
                            break;
                        case "2":
                            fachada.listarProdutos();
                            break;
                        case "3":
                            fachada.removerProduto();
                            break;
                        default:
                            break;
                    }
                    break;

                case "4":
                    System.out.println(
                            "Escolha uma opção: \n1-Nova venda \n2- Número de vendas \n3- Histórico \n4- Voltar");
                    String optionV = scan.nextLine();
                    switch (optionV) {
                        case "1":
                            // nova venda
                            // seria onde instanciaria com cliente produtos list e func
                            // tbm seria onde iria realizar a venda de fato - chamendo metodo de
                            // calcularvalor
                            // e dentro do metodo um if de concluir ou nao
                            // concluindo sim a venda era add no banco do super
                        case "2":
                            // numero de vendas
                            // uma contagem de itens na lista de vendas do super
                        case "3":
                            // historico de vendas
                            // um for da lista de vendas do super
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
