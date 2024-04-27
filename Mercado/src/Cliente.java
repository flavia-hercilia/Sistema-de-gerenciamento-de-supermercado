import java.util.Scanner;

// Classe Cliente que herda de Pessoa
public class Cliente extends Pessoa{

    public String toString() {
        return "Cliente: " + getNomeCompleto() + "\n"
                + "CPF: " + getCPF() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n";
    }

    public void cadastrarCliente(IRepositorioClientes repositorioClientes) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();
        System.out.println("Digite a data de nascimento: ");
        int data = scan.nextInt();
        
        Cliente cliente = new Cliente();
        cliente.setNomeCompleto(nome);
        cliente.setDataNascimento(data);
        cliente.setCPF(cpf);
        
        repositorioClientes.inserir(cliente);

        System.out.println("Cliente " + cliente.getNomeCompleto() + " cadastrado com sucesso!");
        
        //scan.close();
    }

    
}