import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Cliente extends Pessoa{

    public Dictionary<Integer, String> listaClientes = new Hashtable<>();
    
    public Cliente() {
        super();
    }

    public void cadastrarCliente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite a data de nascimento: ");
        int data = scan.nextInt();
        System.out.println("Digite o CPF: ");
        int cpf = scan.nextInt();
        
        Cliente c1 = new Cliente();
        c1.setNomeCompleto(nome);
        c1.setDataNascimento(data);
        c1.setCPF(cpf);

        listaClientes.put(c1.getCPF(), c1.getNomeCompleto());

        System.out.println("Cliente " + c1.getNomeCompleto() + " cadastrado");
        
        scan.close();
    }
}
