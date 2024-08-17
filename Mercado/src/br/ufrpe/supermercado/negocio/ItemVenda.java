package br.ufrpe.supermercado.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ItemVenda {
    private int qtdeDeItem;
    private double valorUnitario;
    private Cliente cliente;
    private Funcionario vendedor;
    private List<Produto> produtosVendidos;
    private Date dataCompra;
    private double valorTotal;
    private double desconto;
    private boolean isFuncionario;

    public ItemVenda(int qtdeDeItem, double valorUnitario, Cliente cliente, Funcionario vendedor,
            List<Produto> produtosVendidos, Date dataCompra, double valorTotal, double desconto,
            boolean isFuncionario) {

        this.qtdeDeItem = qtdeDeItem;
        this.valorUnitario = valorUnitario;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produtosVendidos = produtosVendidos;
        this.dataCompra = dataCompra;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.isFuncionario = isFuncionario;
    }

    public void adicionarProduto(Produto produto) {
        if (produtosVendidos == null) {
            produtosVendidos = new ArrayList<>();
        }
        produtosVendidos.add(produto);
    }

    public void retirarProduto(Produto produto) {
        if (produtosVendidos != null) {
            produtosVendidos.remove(produto);
        }
    }

    public int getQtdeDeItem() {
        return qtdeDeItem;
    }

    public void setQtdeDeItem(int qtdeDeItem) {
        this.qtdeDeItem = qtdeDeItem;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

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
        return produtosVendidos;
    }

    public void setProdutosVendidos(List<Produto> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
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

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public boolean isFuncionario() {
        return isFuncionario;
    }

    public void setFuncionario(boolean isFuncionario) {
        this.isFuncionario = isFuncionario;
    }

}