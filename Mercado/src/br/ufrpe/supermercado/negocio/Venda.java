package br.ufrpe.supermercado.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// import java.util.Scanner;

public class Venda {
    private Cliente cliente;
    private Funcionario vendedor;
    private List<Produto> produtosCarrinho; //colocar key quantidade?
    private Date dataCompra;
    private double valorTotal; 
    // private double desconto; 
    // private boolean isFuncionario;
 
   //metodo que vai retornar o valortotal
   //quando for calcular pegar o valor da chave que sera a quantidade
    

    public void adicionarProduto(Produto produto) {
        //procurar produto por nome na lista de produtos(buscarPorNomeProduto(String nomeProduto)),
        // se tiver retornar a quantidade no estoque? e perguntar a quantidade desejada
        //ai sim adic o produto e a chave sendo a quantidade
        if (produtosCarrinho == null) {
            produtosCarrinho = new ArrayList<>();
        }
        produtosCarrinho.add(produto);
    }

    public void retirarProduto(Produto produto) {
        if (produtosCarrinho != null) {
            produtosCarrinho.remove(produto);
        }
    }

    // public double realizarVenda() {
    //     itensVendidos.add(itemVenda); //podia ser vendas realizadas do super?
    //     // this.dataDaVenda = new Date();

    //     System.out.println("Venda #" + getNumeroVenda() + " realizada com sucesso!");
    //     System.out.println("Data: " + itemVenda.getDataCompra());
    //     System.out.println("Cliente: " + itemVenda.getCliente().getNomeCompleto());
    //     System.out.println("Vendedor: " + itemVenda.getVendedor().getNomeCompleto());
    //     System.out.println("Quantidade de Itens: " + itemVenda.getQtdeDeItem());
    //     System.out.println("Valor Total: " + itemVenda.getValorTotal());
    //     return valorTotal;
    // }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutosVendidos() {
        return produtosCarrinho;
    }

    public void setProdutosVendidos(List<Produto> produtosCarrinho) {
        this.produtosCarrinho = produtosCarrinho;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // public double getDesconto() {
    //     return desconto;
    // }

    // public void setDesconto(double desconto) {
    //     this.desconto = desconto;
    // }

    // public boolean isFuncionario() {
    //     return isFuncionario;
    // }

    // public void setFuncionario(boolean isFuncionario) {
    //     this.isFuncionario = isFuncionario;
    // }

}