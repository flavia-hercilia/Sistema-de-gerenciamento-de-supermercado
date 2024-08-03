package br.ufrpe.supermercado.negocio;

import br.ufrpe.supermercado.dados.produto.IRepositorioProdutos;
import br.ufrpe.supermercado.excecoes.CampoVazioExcecao;

//import br.ufrpe.supermercado.dados.produto.RepositorioArrayProdutos;
import java.util.Scanner;

//import IRepositorioProdutos;

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
        scan.nextLine();

        try {
            if (nomeProduto.trim().isEmpty()) {
                throw new CampoVazioExcecao("O nome do produto não pode estar vazio.");
            }
            if (preco <= 0) {
                throw new CampoVazioExcecao("O preço do produto deve ser maior que zero.");
            }

            Produto produto = new Produto();
            produto.setNomeProduto(nomeProduto);
            produto.setPreco(preco);

            repositorioProdutos.inserir(produto);

            System.out.println("Produto cadastrado!");

        } catch (CampoVazioExcecao ex) {
            System.err.println("Erro ao cadastrar produto: " + ex.getMessage());
        }

        // Produto produto = new Produto();
        // produto.setNomeProduto(nomeProduto);
        // produto.setPreco(preco);

        // repositorioProdutos.inserir(produto);

        // System.out.println("Produto cadastrado!");
        // scan.close();
    }
}