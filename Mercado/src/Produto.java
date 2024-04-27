import java.util.Scanner;

// Classe Produto
// Classe Produto
public class Produto {
    private String nomeProduto;
    private double preco;

    // Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrarProduto(IRepositorioProdutos repositorioProdutos) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scan.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = scan.nextDouble();

        Produto produto = new Produto();
        produto.setNomeProduto(nomeProduto);
        produto.setPreco(preco);

        repositorioProdutos.inserir(produto);

        System.out.println("Produto cadastrado!");
        // scan.close();
    }
}