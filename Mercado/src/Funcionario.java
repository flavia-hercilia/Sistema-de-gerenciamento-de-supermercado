import java.util.Scanner;

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
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeCompleto(nome);
        funcionario.setCPF(cpf);
        funcionario.setDataNascimento(data);

        repositorioFuncionarios.inserir(funcionario);

        System.out.println("Funcionário " + funcionario.getNomeCompleto() + " cadastrado com sucesso!");
        
        // scan.close();
    }

    public String removerFuncionario(IRepositorioFuncionarios repositorioFuncionarios){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o cpf do funcionario para remover: ");
        String itemRm = scan.nextLine();
        


        if(repositorioFuncionarios.buscarPorCPF(itemRm) == true){
            
            repositorioFuncionarios.remover(itemRm);
            return "Funcionario de cpf " + itemRm + " foi removido com sucesso!";
        }else{
            return "Cpf incorreto ou Funcionario nao esta cadastrado!";
        }      

        // scan.close();
        
        
    }
}