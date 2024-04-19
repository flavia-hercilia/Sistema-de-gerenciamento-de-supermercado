import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao mercadinho URFPE!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n1- Cadastro de cliente \n2- Cadastro de produtos \n3- Cadastro funcionários");
        String op = scan.nextLine();


        switch (op) {
            case "1":
                break;
            
            case "2":
                break;
            
            case "3":
                break;
        
            default:
                break;
        }

        scan.close();
    }
}
