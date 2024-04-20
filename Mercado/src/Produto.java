import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Produto {
    public String nomeProduto;
    public double preco;
    Dictionary<String, Double> listaProdutos = new Hashtable<String,Double>();

    public Produto() {
        super();
    }

    public void cadastrarProduto(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        nomeProduto = scan.nextLine();
        System.out.println("Digite o preço do produto: ");
        preco = scan.nextDouble();

        listaProdutos.put(nomeProduto, preco);

        System.out.println("Produto cadastrado!");
        scan.close();
    }
}
