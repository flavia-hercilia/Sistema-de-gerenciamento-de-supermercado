import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao mercadinho URFPE! \n################################");
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n1- Cadastro de cliente \n2- Cadastro de produtos \n3- Cadastro funcionários");
        String option = scan.nextLine();

        Funcionario f = new Funcionario();
        Cliente c = new Cliente();
        Produto p = new Produto();


        switch (option) {
            case "1":
                c.cadastrarCliente();
            break;
            
            case "2":
                p.cadastrarProduto();
            break;
            
            case "3":
                f.cadastrarFuncionario();
                break;
        
            default:
            System.out.println("Opção invalida!");
                break;
        }

        scan.close();
    }
}
