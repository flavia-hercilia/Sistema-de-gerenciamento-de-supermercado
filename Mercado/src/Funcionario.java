import java.util.Scanner;

public class Funcionario extends Pessoa{
    public Funcionario() {
        super();
    }

    public void cadastrarFuncionario(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite a data de nascimento: ");
        int data = scan.nextInt();
        System.out.println("Digite o CPF: ");
        int cpf = scan.nextInt();
        
        Funcionario f1 = new Funcionario();
        f1.setNomeCompleto(nome);
        f1.setDataNascimento(data);
        f1.setCPF(cpf);

        System.out.println("Funcionário " + f1 + " cadastrado");
        
        scan.close();
    }
}
